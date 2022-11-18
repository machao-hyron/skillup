package com.hyron.atsdemo;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.hyron.atsdemo.pojo.WorkTime;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.util.Date;
import java.util.List;

@SpringBootTest
class AtsApplicationTests {
//    @Autowired
//    WorkTimeService workTimeService;
//    @Test
//    void contextLoads() {
//    }
//    @Test
//    public void test2() {
//        try {
//            FileInputStream fileInputStream = new FileInputStream("D:\\hyron\\skillup\\综合练习2_机能说明.xlsx");
//            ImportParams params = new ImportParams();
//            params.setTitleRows(0);
//            params.setHeadRows(1);
//            params.setStartSheetIndex(3);//读取的sheet为第四个
//            long start = new Date().getTime();
//            List<WorkTime> list = ExcelImportUtil.importExcel(
//                    fileInputStream, WorkTime.class, params);
//            System.out.println(list.get(0));
//            System.out.println(new Date().getTime() - start);
//            System.out.println(list.size());
//            System.out.println(ReflectionToStringBuilder.toString(list.get(0)));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}
