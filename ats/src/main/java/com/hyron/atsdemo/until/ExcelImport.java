package com.hyron.atsdemo.until;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.hyron.atsdemo.pojo.WorkTime;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.FileInputStream;
import java.util.*;

public class ExcelImport {
    public static final String sql="insert into t_emp";

    public static List<WorkTime>  excelImport() throws Exception{

            FileInputStream fileInputStream = new FileInputStream("D:\\hyron\\skillup\\综合练习2_机能说明.xlsx");
            ImportParams params = new ImportParams();
            //params.setTitleRows(0);//标题的位置
            params.setHeadRows(2);//header列的位置
            params.setStartSheetIndex(4);//读取的sheet为第5个
            params.setImportFields(new String[]{"部门","工号"});//标题里必须有部门和工号，没有就不能导入
            long start = new Date().getTime();
            List<WorkTime> list = ExcelImportUtil.importExcel(fileInputStream, WorkTime.class, params);
//            System.out.println(new Date().getTime() - start);
//            System.out.println(list.size());
//            System.out.println(ReflectionToStringBuilder.toString(list.get(0)));
            return list;
    }

}
