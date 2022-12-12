package com.hyron.ats.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelIgnore;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.Year;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ExcelTarget("employee")
public class Employee {
    @Excel(name = "工号")
    private String employeeId;//工号
    @Excel(name = "部门ID")
    private String departmentId;//部门ID
    @Excel(name = "项目ID")
    private String projectId;//所属项目ID
    @Excel(name = "姓名")
    private String employeeName;//姓名
    @Excel(name = "性别",replace = {"男_M","女_F"})
    private String employeeSex;//性别
    @Excel(name = "生年月日")
    private Date employeeBirth;//生年月日
    @Excel(name = "毕业年",format = "yyyy")
    private Year graduationYear;//毕业年
    @Excel(name = "毕业学校")
    private String graduationUniversity;//毕业学校
    @Excel(name = "入职年月日",format = "yyyy/MM/dd")
    private Date inductionDate;//入职年月日
    @Excel(name = "是否在职",replace = {"是_0","否_1"})
    private Integer onJobFlg;//在职Flg
    @Excel(name = "退职年月日",format = "yyyy/MM/dd")
    private Date resignationDate;//退职年月日
    @Excel(name = "照片",type=2)
    private String employeeImg;//照片IMG
    @ExcelIgnore
    private Timestamp createTime;//登录时间
    @ExcelIgnore
    private String createUserId;//登录者
    @ExcelIgnore
    private Timestamp updateTime;//更新时间
    @ExcelIgnore
    private String updateUserId;//更新者
}

