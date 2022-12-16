package com.hyron.ats.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.hyron.ats.pojo.Employee;
import com.hyron.ats.service.EmployeeImportService;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.List;

@Controller
//@RequestMapping("EmployeeImportAndExport")
@Slf4j
public class EmployeeImportController {
        @Autowired
        private EmployeeImportService employeeImportService;

        @GetMapping("EmployeeImportAndExport")
        public String employeeImportAndExport(){
            return "EmployeeImportAndExport";
        }

        @RequestMapping(value = "findAll",method = RequestMethod.GET)
        public String findAll(HttpServletRequest request){
            List<Employee> employees = employeeImportService.findAll();
            request.setAttribute("employees",employees);
            return "findAll";
        }
        @RequestMapping(value = "findByIdAndName",method = RequestMethod.GET)
        public String findByIdAndName(@RequestParam String employeeId,
                                      @RequestParam String departmentId,
                                      @RequestParam String employeeName,
                                      HttpServletRequest request){
            List<Employee> employees = employeeImportService.findByIdAndName(employeeId,departmentId,employeeName);
            request.setAttribute("employees",employees);
            return "findByIdAndName";

        }

        //导入excel
        @RequestMapping("import")
        public String importExcel(MultipartFile excelFile) throws Exception{//MultipartFile实现文件上传
            log.info("文件名：[{}]",excelFile.getOriginalFilename());
            //进行excel导入
            ImportParams params = new ImportParams();
            //params.setTitleRows(1);//标题的位置
            params.setHeadRows(1);//header列的位置
            params.setStartSheetIndex(4);//读取的sheet为第5个
            //params.setImportFields(new String[]{"工号","部门"});
            List<Employee> employees = ExcelImportUtil.importExcel(excelFile.getInputStream(), Employee.class, params);//实现文件导入
            // emps.forEach(System.out::println);
            employeeImportService.setDataFromExcel(employees);//存入数据库
            return "redirect:findAll";//上传完成后跳转到查询的路径
        }
}


