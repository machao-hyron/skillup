package com.longyue.orvetimeservice.controller;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.longyue.orvetimeservice.config.PageUtils;
import com.longyue.orvetimeservice.domain.TEmployeeInfo;
import com.longyue.orvetimeservice.service.GetPdfFile;
import com.longyue.orvetimeservice.service.TEmployeeInfoService;

import okhttp3.Response;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tEmployeeInfo")
public class TEmployeeInfoController {
    @Resource
    private TEmployeeInfoService tEmployeeInfoService;

    @Resource
    private GetPdfFile getPdfFile;

    /**
     *  获取全部员工
     * @return
     */
    @GetMapping("/getTEmployeeInfoList")
    public List<TEmployeeInfo> getTEmployeeInfoList(Map<String, Object> params){
        List<TEmployeeInfo> list = tEmployeeInfoService.getTEmployeeInfoList();
        return list;
    }
    /**
     *  分页查询全部员工
     */
    @GetMapping("/getTEmployeeInfoPage")
    public PageUtils getTEmployeeInfoPage(@RequestParam Map<String, Object> params){
        PageUtils pageUtils = tEmployeeInfoService.queryPage(params);
        return pageUtils;
    }
    /**
     *  导出全部excel 员工
     */
    @PostMapping("/exeortExcel")
    public void exeortExcel(@RequestBody Map<String, Object> params, HttpServletResponse httpServletResponse) throws IOException {
          tEmployeeInfoService.exeortExcel(params,httpServletResponse);
    }
    /**
     *  发送pdf邮件文件
     */
    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody Map<String,Object> params){
        String re = tEmployeeInfoService.sendEmail(params);
        if(StringUtils.isNotEmpty(re)) return  re;
        return "发送成功";
    }
    /**
     *  获取pdf文件
     */
    @PostMapping("/getPdfFile")
    public void getPdfFile(Map<String,Object> params){
        getPdfFile.postPdf(params);
    }
}
