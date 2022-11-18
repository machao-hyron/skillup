package com.hyron.atsdemo.pojo;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelIgnore;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ExcelTarget("emp")
public class Emp implements Serializable {
    @Excel(name = "工号")
    private String jobId;
    @Excel(name = "部门")
    private String depId;
    @Excel(name = "项目")
    private String projectId;
    @Excel(name = "姓名")
    private String empName;
    @Excel(name = "性别",replace = {"男_1","女_0"})
    private Integer sex;
    @Excel(name = "生日",format = "yyyy年MM月dd日")
    private Timestamp birthdayDatetime;
    @Excel(name = "毕业时间",format = "yyyy年MM月dd日")
    private Date leaveSchoolTime;
    @Excel(name = "毕业学校")
    private String school;
    @Excel(name = "入职时间",format = "yyyy年MM月dd日")
    private Timestamp joinTime;
    @Excel(name = "在职标志",replace = {"是_1","否_0"})
    private Integer onJobFlag;
    @Excel(name = "离职时间",format = "yyyy年MM月dd日")
    private Timestamp leaveTime;
    @Excel(name = "照片",width = 30,height = 50,type=2,savePath = "D:\\hyron\\skillup\\ats\\src\\main\\resources\\static\\img")
    private String empImg;
    @ExcelIgnore
    private Timestamp loginDatetime;
    @ExcelIgnore
    private String loginUser;
    @ExcelIgnore
    private Timestamp updateDatetime;
    @ExcelIgnore
    private String updateUser;
}
