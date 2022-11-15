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
public class Emp {
    @Excel(name = "工号")
    private String jobId;
    @Excel(name = "部门")
    private String depId;
    @Excel(name = "项目")
    private String projectId;
    @Excel(name = "姓名")
    private String empName;
    @Excel(name = "性别")
    private char sex;
    @Excel(name = "生日")
    private Timestamp birthdayDatetime;
    @Excel(name = "毕业时间")
    private Date leaveSchoolTime;
    @Excel(name = "毕业学校")
    private String school;
    @Excel(name = "入职时间")
    private Timestamp joinTime;
    @Excel(name = "在职标志")
    private char onJobFlag;
    @Excel(name = "离职时间")
    private Timestamp leaveTime;
    @ExcelIgnore
    private Blob empImg;
    @ExcelIgnore
    private Timestamp loginDatetime;
    @ExcelIgnore
    private String loginUser;
    @ExcelIgnore
    private Timestamp updateDatetime;
    @ExcelIgnore
    private String updateUser;
}
