package com.longyue.orvetimeservice.service.impl;


import cn.hutool.core.lang.copier.Copier;
import com.alibaba.excel.EasyExcel;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.core.metadata.TableInfoHelper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.github.yulichang.base.MPJBaseServiceImpl;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import com.longyue.orvetimeservice.chapter.PdfChapter;
import com.longyue.orvetimeservice.chapter.PdfSection;
import com.longyue.orvetimeservice.chapter.PdfText;
import com.longyue.orvetimeservice.config.EmailUtil;
import com.longyue.orvetimeservice.config.PageUtils;
import com.longyue.orvetimeservice.config.PdfUtil;
import com.longyue.orvetimeservice.config.Query;
import com.longyue.orvetimeservice.domain.TAccountInfo;
import com.longyue.orvetimeservice.domain.TDepartmentMst;
import com.longyue.orvetimeservice.domain.TEmployeeInfo;
import com.longyue.orvetimeservice.domain.TWorkTime;
import com.longyue.orvetimeservice.domain.dto.UTEmployeeInfoDTO;
import com.longyue.orvetimeservice.domain.dto.UTEmployeePTF;
import com.longyue.orvetimeservice.domain.vo.TEmployeeInfoVo;
import com.longyue.orvetimeservice.mapper.TDepartmentMstMapper;
import com.longyue.orvetimeservice.service.GetPdfFile;
import com.longyue.orvetimeservice.service.TEmployeeInfoService;
import com.longyue.orvetimeservice.mapper.TEmployeeInfoMapper;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Service
@Slf4j
public class TEmployeeInfoServiceImpl<C> extends MPJBaseServiceImpl<TEmployeeInfoMapper, TEmployeeInfo>
        implements TEmployeeInfoService {

    @Resource
    private TDepartmentMstMapper tDepartmentMstMapper;

    @Resource
    private EmailUtil emailUtil;

    @Resource
    private PdfUtil pdfUtil;

    @Resource
    private GetPdfFile getPdfFilel;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        List<TableInfo> tableInfos = TableInfoHelper.getTableInfos();
        List<TDepartmentMst> tDepartmentMsts = tDepartmentMstMapper.selectList(null);
        MPJLambdaWrapper<TEmployeeInfo> tEmployeeInfoMPJLambdaWrapper = buildParms(params);

        IPage<UTEmployeeInfoDTO> utEmployeeInfoDTOIPage =
                this.selectJoinListPage(new Query<UTEmployeeInfoDTO>().getPage(params), UTEmployeeInfoDTO.class, tEmployeeInfoMPJLambdaWrapper);
        return new PageUtils(utEmployeeInfoDTOIPage);
    }

    private static MPJLambdaWrapper buildParms(Map<String, Object> params) {

        MPJLambdaWrapper<TEmployeeInfo> tEmployeeInfoMPJLambdaWrapper = new MPJLambdaWrapper<TEmployeeInfo>()
                .selectAll(TEmployeeInfo.class)
                .selectAssociation(TDepartmentMst.class, TEmployeeInfo::getTDepartmentMst)
                .selectAssociation(TWorkTime.class, TEmployeeInfo::getTWorkTime)
                .selectAssociation(TAccountInfo.class, TEmployeeInfo::getTAccountInfo)
                .rightJoin(TDepartmentMst.class, TDepartmentMst::getDepartmentId, TEmployeeInfo::getDepartmentId)
                .leftJoin(TWorkTime.class, TWorkTime::getEmployeeId, TEmployeeInfo::getEmployeeId)
                .leftJoin(TAccountInfo.class, TAccountInfo::getEmployeeId, TEmployeeInfo::getEmployeeId);
        if (ObjectUtils.isEmpty(params)) return tEmployeeInfoMPJLambdaWrapper;
        if (params.containsKey("overtime") && ObjectUtils.isNotEmpty(params.get("overtime"))) {
            String orertime = String.valueOf(params.get("overtime"));
            if (orertime.equals("加班时间超过50")) tEmployeeInfoMPJLambdaWrapper.ge(TWorkTime::getExtraWorkTime, 50);
            // TODO
            if (orertime.equals("周末加班时间多余平时"))
                tEmployeeInfoMPJLambdaWrapper.ge(TWorkTime::getExtraWorkTime, 50);
        }
        if (params.containsKey("aggregationObject") && ObjectUtils.isNotEmpty(params.get("aggregationObject"))) {
            String aggregationObject = String.valueOf(params.get("aggregationObject"));
            if (aggregationObject.equals("人名")) {
                tEmployeeInfoMPJLambdaWrapper.selectCount(TEmployeeInfo::getEmployeeId);
            }
            if (aggregationObject.equals("项目")) {
                tEmployeeInfoMPJLambdaWrapper.selectCount(TEmployeeInfo::getDepartmentId);
            }
            if (aggregationObject.equals("部门")) {
                tEmployeeInfoMPJLambdaWrapper.selectCount(TEmployeeInfo::getDepartmentId);
            }
        }
        if (params.containsKey("aggregationPeriod") && ObjectUtils.isNotEmpty(params.get("aggregationPeriod"))) {
            String aggregationPeriod = String.valueOf(params.get("aggregationPeriod"));
            if (aggregationPeriod.equals("月")) {

            }
            if (aggregationPeriod.equals("年")) {

            }
            if (aggregationPeriod.equals("手入力期间")) {

            }
        }

        return tEmployeeInfoMPJLambdaWrapper;
    }

    /**
     * 判断时间是不是周末
     *
     * @param date
     * @return
     */
    private boolean isWeekend(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY;
    }

    @Resource
    private TEmployeeInfoMapper tEmployeeInfoMapper;

    @Override
    public List<TEmployeeInfo> getTEmployeeInfoList() {
        List<TEmployeeInfo> tEmployeeInfoList = tEmployeeInfoMapper.getTEmployeeInfoList();

        return tEmployeeInfoList;
    }

    @Override
    public void exeortExcel(Map<String, Object> params, HttpServletResponse response) throws IOException {
        //设置返回文件名称和格式
        getExcelOutputStream("导出表", response);
        List<TEmployeeInfoVo> tEmployeeInfoList = this.getTEmployeeInfoList().stream().map(item -> {
                    TEmployeeInfoVo tEmployeeInfoVo = new TEmployeeInfoVo();
                    BeanUtils.copyProperties(item, tEmployeeInfoVo);
                    return tEmployeeInfoVo;
                }
        ).collect(Collectors.toList());
        if (!CollectionUtils.isNotEmpty(params)) {
            try (OutputStream outputStream = response.getOutputStream()) {
                EasyExcel.write(outputStream, TEmployeeInfoVo.class)
                        .sheet("导出表").doWrite(tEmployeeInfoList);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String sendEmail(Map<String, Object> params) {
        if (!params.containsKey("email") && ObjectUtils.isEmpty(params.get("email"))) {
            return "无邮箱信息";
        }
        String email = String.valueOf(params.get("email")).replace("[", "").replace("]", "");
        File file = null;
        try {
            file = this.buildPdfFile(params);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        emailUtil.sendMessageCarryFile(email, "员工信息", "PDF内容", file);
        return "发送成功";
    }

    /**
     * 构建pdfFile
     *
     * @return 返回pdf文件流
     */
    private File buildPdfFile(Map<String, Object> params) throws UnsupportedEncodingException {
        File file = getFile(params);
        return file;
    }

    @NotNull
    private File getFile(Map<String, Object> params) throws UnsupportedEncodingException {
        String path = this.getClass().getResource("").getPath() + UUID.randomUUID().toString() + ".pdf";
        path =  URLDecoder.decode(path,"utf-8");
        File file = new File(path);
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file)) ;
            InputStream inputStream = getPdfFilel.postPdf(params);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            int read;
            byte[] bytes = new byte[1024];
            while ((read = inputStream.read(bytes)) !=-1){
                fileOutputStream.write(bytes,0,read);
            }
            inputStream.close();
        } catch (Exception e) {
                log.error("创建文件失败");
        }
        return file;
    }

    /**
     * 构建pdf 数据
     *
     * @return 返回pdf内容
     */
    private PdfChapter createContent(Map<String, Object> params) {
        PageUtils pageUtils = this.queryPage(params);
        List<UTEmployeeInfoDTO> list = (List<UTEmployeeInfoDTO>) pageUtils.getList();
        String collect = list.stream().map(item -> {
            UTEmployeePTF utEmployeePTF = new UTEmployeePTF();
            utEmployeePTF.setEmpId(item.getEmployeeId());
            utEmployeePTF.setEmployeeName(item.getEmployeeName());
            utEmployeePTF.setDepartmentName(item.getTDepartmentMst().getDepartmentName());
            utEmployeePTF.setDataTime(item.getTWorkTime().getLeaveTime());
            return utEmployeePTF.toString();
        }).collect(Collectors.joining());
        pageUtils.getList();
        PdfChapter pdfChapter = new PdfChapter();
        pdfChapter.setTitle("员工信息一揽");
        pdfChapter.setOrder(1);
        PdfSection section = new PdfSection();
        section.setTitle("pdf");
        PdfText pdfText = new PdfText();
        pdfText.setText(collect);
        section.getPdfTexts().add(pdfText);
        pdfChapter.getSections().add(section);
        return pdfChapter;
    }

    /**
     * 导出文件时为Writer生成OutputStream
     *
     * @param fileName: 文件名称
     * @param response:
     */
    public static void getExcelOutputStream(String fileName,
                                            HttpServletResponse response) throws IOException {
        try {
            fileName = URLEncoder.encode(fileName, "UTF-8");
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf8");
            response.setHeader("Content-Disposition", "attachment; filename=" + fileName + ".xlsx");
            response.setHeader("Pragma", "public");
            response.setHeader("Cache-Control", "no-store");
            response.addHeader("Cache-Control", "max-age=0");
//            response.setHeader("content-Type", "application/vnd.ms-excel");
        } catch (IOException e) {
            throw new IOException("导出excel表格失败!", e);
        }
    }
}




