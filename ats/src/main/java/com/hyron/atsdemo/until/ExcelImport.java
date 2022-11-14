package com.hyron.atsdemo.until;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.hyron.atsdemo.pojo.WorkTime;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.FileInputStream;
import java.util.Date;
import java.util.List;

public class ExcelImport {

    public static List  excelImport() {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\hyron\\skillup\\综合练习2_机能说明.xlsx");
            ImportParams params = new ImportParams();
            params.setTitleRows(0);
            params.setHeadRows(1);
            params.setStartSheetIndex(3);//读取的sheet为第四个
            long start = new Date().getTime();
            List<WorkTime> list = ExcelImportUtil.importExcel(
                    fileInputStream, WorkTime.class, params);
            System.out.println(new Date().getTime() - start);
            System.out.println(list.size());
            System.out.println(ReflectionToStringBuilder.toString(list.get(0)));
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
}
}
