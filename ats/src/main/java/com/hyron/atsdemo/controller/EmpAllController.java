package com.hyron.atsdemo.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.util.PoiPublicUtil;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.File;
import java.util.Date;

public class EmpAllController {


    public void test2() {
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);
        long start = new Date().getTime();
        List<MsgClient> list = ExcelImportUtil.importExcel(
                new File(PoiPublicUtil.getWebRootPath("D:\\hyron\\skillup\\综合练习2_机能说明.xlsx")),
                MsgClient.class, params);
        System.out.println(new Date().getTime() - start);
        System.out.println(list.size());
        System.out.println(ReflectionToStringBuilder.toString(list.get(0)));
    }
}
