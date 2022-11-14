package com.hyron.atsdemo.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkTime {

    private Integer no;
    @Excel(name = "部门")
    private String depId;
    @Excel(name = "工号")
    private String jobId;
    @Excel(name = "姓名")
    private String empName;
    @Excel(name = "日期",format="yyyy-MM-dd")
    private Date workDatetime;
    @Excel(name = "上午上班",format="HH:mm:ss")
    private Timestamp amTime;
    @Excel(name = "下午下班",format="HH:mm:ss")
    private Timestamp pmTime;
    @ExcelIgnore
    private Integer overtime;
    @ExcelIgnore
    private Timestamp loginDatetime;
    @ExcelIgnore
    private String loginUser;
    @ExcelIgnore
    private Timestamp updateDatetime;
    @ExcelIgnore
    private String updateUser;
}
