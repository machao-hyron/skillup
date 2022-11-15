package com.hyron.atsdemo.service.serviceImpl;

import com.hyron.atsdemo.pojo.WorkTime;
import com.hyron.atsdemo.service.WorkTimeService;
import com.hyron.atsdemo.until.ExcelImport;

import java.util.List;

public class WorkTimeServiceImpl implements WorkTimeService {
    @Override
    public List<WorkTime> setDataFromExcel(List list) {
        List list1 = ExcelImport.excelImport();//{a,b,c}
        return list1 ;
    }
}
