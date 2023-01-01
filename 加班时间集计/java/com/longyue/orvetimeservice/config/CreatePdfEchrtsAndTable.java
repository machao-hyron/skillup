package com.longyue.orvetimeservice.config;
import cn.hutool.core.date.DateUtil;

import cn.hutool.extra.template.TemplateException;
import cn.hutool.http.HttpBase;
import cn.hutool.http.HttpResponse;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.longyue.orvetimeservice.domain.DuizhangDomain;
import com.longyue.orvetimeservice.domain.PageEvent;
import com.longyue.orvetimeservice.domain.YqTable;
import com.longyue.orvetimeservice.domain.dto.UTEmployeeInfoDTO;
import com.longyue.orvetimeservice.domain.dto.UTEmployeePTF;
import com.longyue.orvetimeservice.service.TEmployeeInfoService;
import org.apache.catalina.connector.Response;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CreatePdfEchrtsAndTable {
        @Resource
        private TEmployeeInfoService tEmployeeInfoService;
        @PostMapping("/createPdfFile")
        public void createPdfFile(HttpServletResponse response) throws IOException, DocumentException, TemplateException {
            //设置请求返回类型
            response.setHeader("Content-Disposition", "attachment; filename=测试.pdf");
            OutputStream outputStream = response.getOutputStream();
            //模板路径，放到项目里用这个ClassPathResource
            ClassPathResource classPathResource = new ClassPathResource("templates/test3.pdf");
            InputStream inputStream = classPathResource.getInputStream();

            PdfReader reader = new PdfReader(inputStream);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            PdfStamper ps = new PdfStamper(reader, bos);

            //设置字体
            final BaseFont font = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            ArrayList<BaseFont> fontList = new ArrayList<>();
            fontList.add(font);

            //提取表单
            AcroFields s = ps.getAcroFields();
            s.setSubstitutionFonts(fontList);

            s.setFieldProperty("type", "textfont", font, null);
            s.setFieldProperty("createTime", "textfont", font, null);
            s.setFieldProperty("title", "textfont", font, null);
            s.setField("type", "日报");
            s.setField("createTime", DateUtil.now());
            s.setField("title", "这是title，模板画的位置框");
            ps.setFormFlattening(true);
            ps.close();

            //*******************填充编辑好后的pdf**************
            reader = new PdfReader(bos.toByteArray());
            Rectangle pageSize = reader.getPageSize(1);
            Document document = new Document(pageSize);
            PdfWriter writer = PdfWriter.getInstance(document, outputStream);
            writer.setPageEvent(new PageEvent());
            // 打开文档
            document.open();
            PdfContentByte cbUnder = writer.getDirectContentUnder();
            PdfImportedPage pageTemplate = writer.getImportedPage(reader, 1);
            cbUnder.addTemplate(pageTemplate, 0, 0);
            //添加间隙,这里为进行了一个封装，因为这个模板第一页只有一些title啥的，
            //重开一页太浪费，只需要确定表格要在什么位置生成，添加一个间隙就可以了
            createBlankTable(writer, document, font, 180);

            createTable(writer, document);

            createBlankTable(writer, document, font, 20);
            document.close();
            outputStream.close();
        }

        //为一个表格添加内容
        public PdfPCell createSetCell(String value, Font font) {
            PdfPCell cell = new PdfPCell();
            cell.setPhrase(new Phrase(value, font));
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            return cell;
        }

        //添加表格
        public void createTable(PdfWriter writer, Document document) throws DocumentException, IOException {

            PdfPTable table = new PdfPTable(new float[]{30, 80, 50, 50, 50});
            table.setTotalWidth(520);
            table.setPaddingTop(500);
            table.setLockedWidth(true);
            table.setHorizontalAlignment(Element.ALIGN_CENTER);//居中
            table.writeSelectedRows(0, -1, 500, 800, writer.getDirectContentUnder());
            //每页都显示表头,输入几就是第几行的表头固定
            table.setHeaderRows(1);
            table.setHeaderRows(2);

            //定义数据的字体
            BaseFont baseFont = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            Font textFont = new Font(baseFont, 10, Font.NORMAL);

            //表头信息
            PdfPCell heandCell = new PdfPCell();
            heandCell.setRowspan(1);
            heandCell.setColspan(5);
            heandCell.setFixedHeight(30);
            heandCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            heandCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            heandCell.setPhrase(new Phrase("加班时间表", textFont));
            table.addCell(heandCell);

            //表字段
            String title[] = {"序号","工号", "部门", "姓名", "累计加班时长(单位)"};
            for (int i = 0; i < title.length; i++) {
                PdfPCell heardCell = new PdfPCell();
                heardCell.setRowspan(1);
                heardCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                heardCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                heardCell.setPhrase(new Phrase(title[i], textFont));
                heardCell.setMinimumHeight(20);
                table.addCell(heardCell);

            }
            //列表数据tEmployeeInfoService
            PageUtils pageUtils = tEmployeeInfoService.queryPage(new HashMap<>());
            List<UTEmployeeInfoDTO> list = (List<UTEmployeeInfoDTO>) pageUtils.getList();
            List<UTEmployeePTF> collect = list.stream().map(item -> {
                UTEmployeePTF utEmployeePTF = new UTEmployeePTF();
                utEmployeePTF.setEmpId(item.getEmployeeId());
                utEmployeePTF.setEmployeeName(item.getEmployeeName());
                utEmployeePTF.setDepartmentName(item.getTDepartmentMst().getDepartmentName());
                utEmployeePTF.setDataTime(item.getTWorkTime().getLeaveTime());
                return utEmployeePTF;
            }).collect(Collectors.toList());
            ArrayList<UTEmployeePTF> utEmployeePTFS = new ArrayList<>();
            for (int i = 0; i < collect.size(); i++) {
                UTEmployeePTF utEmployeePTF = new UTEmployeePTF();
                utEmployeePTF.setEmpId(collect.get(i).getEmpId()).setDepartmentName(collect.get(i).getDepartmentName())
                        .setEmployeeName(collect.get(i).getEmployeeName()).setDataTime(collect.get(i).getDataTime());
                utEmployeePTFS.add(utEmployeePTF);
            }
            for (int i = 0; i < utEmployeePTFS.size(); i++) {
                PdfPCell setCell1 = createSetCell((i + 1) + "", textFont);
                PdfPCell setCell2 = createSetCell(utEmployeePTFS.get(i).getEmpId(), textFont);
                PdfPCell setCell3 = createSetCell(utEmployeePTFS.get(i).getDepartmentName().toString(), textFont);
                PdfPCell setCell4 = createSetCell(utEmployeePTFS.get(i).getEmployeeName().toString(), textFont);
                PdfPCell setCell5 = createSetCell(utEmployeePTFS.get(i).getDataTime() + "%", textFont);
                table.addCell(setCell1);
                table.addCell(setCell2);
                table.addCell(setCell3);
                table.addCell(setCell4);
                table.addCell(setCell5);
            }
            document.add(table);
        }


        public void createTableYq(PdfWriter writer, Document document) throws DocumentException, IOException {

            PdfPTable table = new PdfPTable(new float[]{80, 50});
            table.setTotalWidth(520);
            table.setPaddingTop(500);
            table.setLockedWidth(true);
            table.setHorizontalAlignment(Element.ALIGN_CENTER);//居中
            table.writeSelectedRows(0, -1, 500, 800, writer.getDirectContentUnder());
            //每页都显示表头,输入几就是第几行的表头固定
            table.setHeaderRows(2);
            table.setHeaderRows(3);

            //定义数据的字体
            BaseFont baseFont = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            Font textFont = new Font(baseFont, 10, Font.NORMAL);

            //表头信息
            PdfPCell heandCell = new PdfPCell();
            heandCell.setRowspan(1);
            heandCell.setColspan(2);
            heandCell.setFixedHeight(30);
            heandCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            heandCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            heandCell.setPhrase(new Phrase("逾期表", textFont));
            table.addCell(heandCell);

            //表字段
            String title[] = {"机构名称", "逾期数"};
            for (int i = 0; i < title.length; i++) {
                PdfPCell heardCell = new PdfPCell();
                heardCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                heardCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                heardCell.setPhrase(new Phrase(title[i], textFont));
                heardCell.setMinimumHeight(20);
                table.addCell(heardCell);
            }

            //列表数据

            ArrayList<YqTable> yqTables = new ArrayList<>();
            for (int i = 1; i <= 1000; i++) {
                YqTable yq = new YqTable();
                yq.setJg("逾期机构" + i).setYqs(i);
                yqTables.add(yq);
            }

            for (int i = 0; i < yqTables.size(); i++) {
                PdfPCell setCell2 = createSetCell(yqTables.get(i).getJg(), textFont);
                PdfPCell setCell3 = createSetCell(yqTables.get(i).getYqs().toString(), textFont);
                table.addCell(setCell2);
                table.addCell(setCell3);
            }
            document.add(table);
        }

        /**
         * 创建表格跟表格之间的空白间隔
         */
        public void createBlankTable(PdfWriter writer, Document document, BaseFont font, int height) throws DocumentException {
            PdfPTable table = new PdfPTable(new float[]{30});
            table.setTotalWidth(520);
            table.setPaddingTop(500);
            table.setLockedWidth(true);
            table.setHorizontalAlignment(Element.ALIGN_CENTER);//居中
            table.writeSelectedRows(0, -1, 500, 800, writer.getDirectContentUnder());
            Font textFont = new Font(font, 10, Font.NORMAL);
            PdfPCell cell = new PdfPCell(new Paragraph(" ", textFont));

            cell.setHorizontalAlignment(Element.ALIGN_LEFT);

            cell.setVerticalAlignment(Element.ALIGN_BOTTOM);

            cell.setBorder(Rectangle.NO_BORDER);
            cell.setFixedHeight(height);

            cell.setColspan(1);

            table.addCell(cell);
            document.add(table);
        }

}
