package com.hyron.atsdemo.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.hyron.atsdemo.pojo.Emp;
import com.hyron.atsdemo.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/emp")
@Slf4j
public class EmpController {
    @Autowired
    private EmpService empService;

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
        List<Emp> emps = ExcelImportUtil.importExcel(excelFile.getInputStream(), Emp.class, params);
       // emps.forEach(System.out::println);
        empService.setDataFromExcel(emps);
        return "redirect:/empall/findAll";//上传完成后跳转到查询的路径
    }
}
