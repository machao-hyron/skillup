package com.hyron.atsdemo.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.hyron.atsdemo.pojo.Emp;
import com.hyron.atsdemo.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URLEncoder;
import java.util.List;

@Controller
@RequestMapping("/emp")
@Slf4j
public class EmpController {
    @Autowired
    private EmpService empService;
//    @Value("${upload.dir}")
//    private String realPath;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public String findAll(HttpServletRequest request){
        List<Emp> emps = empService.findAll();
        request.setAttribute("emps",emps);
        return "emp";
    }
    
    //导入excel
    @RequestMapping("/import")
    public String importExcel(MultipartFile excelFile) throws Exception{
      log.info("文件名：[{}]",excelFile.getOriginalFilename());
        //进行excel导入
        ImportParams params = new ImportParams();
        //params.setTitleRows(1);//标题的位置
        params.setHeadRows(1);//header列的位置
        params.setStartSheetIndex(4);//读取的sheet为第5个
        //params.setImportFields(new String[]{"工号","部门"});
        List<Emp> emps = ExcelImportUtil.importExcel(excelFile.getInputStream(), Emp.class, params);//实现文件导入
       // emps.forEach(System.out::println);
        empService.setDataFromExcel(emps);//存入数据库
        return "redirect:findAll";//上传完成后跳转到查询的路径
    }
    @RequestMapping("/export")
    public String exportExcel(HttpServletResponse response) throws Exception{
        List<Emp> emps = empService.findAll();
//        emps.forEach(emp -> {
//            emp.setEmpImg(realPath+"/"+emp.getEmpImg());
//        });
        log.info("导出Excel");
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("员工信息一揽", "员工信息"), Emp.class, emps);
        response.setHeader("content-disposition","attachment;fileName"+ URLEncoder.encode("用户列表.xls","UTF-8"));//对响应头转码，防止中午乱码
        ServletOutputStream outputStream = response.getOutputStream();//输出流
        workbook.write(outputStream);//将流写入
        //关闭流
        outputStream.close();
        workbook.close();
        return "redirect:findAll";//上传完成后跳转到查询的路径
    }
}
