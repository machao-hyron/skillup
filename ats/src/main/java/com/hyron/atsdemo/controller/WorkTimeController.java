package com.hyron.atsdemo.controller;

import com.hyron.atsdemo.until.ExcelImport;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.List;

public class WorkTimeController {
    @RequestMapping("/excelInput")
    public String excelInput(){
        List excelImport = ExcelImport.excelImport();
        return "empall";
    }
}
