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

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
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
    @Excel(name = "生日",format = "yyyy/MM/dd")
    private Timestamp birthdayDatetime;
    @Excel(name = "毕业时间",format = "yyyy/MM/dd")
    private Date leaveSchoolTime;
    @Excel(name = "毕业学校")
    private String school;
    @Excel(name = "入职时间",format = "yyyy/MM/dd")
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

    public Emp() {
    }

    public Emp(String jobId, String depId, String projectId, String empName, Integer sex, Timestamp birthdayDatetime, Date leaveSchoolTime, String school, Timestamp joinTime, Integer onJobFlag, Timestamp leaveTime, String empImg) {
        this.jobId = jobId;
        this.depId = depId;
        this.projectId = projectId;
        this.empName = empName;
        this.sex = sex;
        this.birthdayDatetime = birthdayDatetime;
        this.leaveSchoolTime = leaveSchoolTime;
        this.school = school;
        this.joinTime = joinTime;
        this.onJobFlag = onJobFlag;
        this.leaveTime = leaveTime;
        this.empImg = empImg;
    }

    public Emp(String jobId, String depId, String projectId, String empName, Integer sex, Timestamp birthdayDatetime, Date leaveSchoolTime, String school, Timestamp joinTime, Integer onJobFlag, Timestamp leaveTime, String empImg, Timestamp loginDatetime, String loginUser, Timestamp updateDatetime, String updateUser) {
        this.jobId = jobId;
        this.depId = depId;
        this.projectId = projectId;
        this.empName = empName;
        this.sex = sex;
        this.birthdayDatetime = birthdayDatetime;
        this.leaveSchoolTime = leaveSchoolTime;
        this.school = school;
        this.joinTime = joinTime;
        this.onJobFlag = onJobFlag;
        this.leaveTime = leaveTime;
        this.empImg = empImg;
        this.loginDatetime = loginDatetime;
        this.loginUser = loginUser;
        this.updateDatetime = updateDatetime;
        this.updateUser = updateUser;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Timestamp getBirthdayDatetime() {
        return birthdayDatetime;
    }

    public void setBirthdayDatetime(Timestamp birthdayDatetime) {
        this.birthdayDatetime = birthdayDatetime;
    }

    public Date getLeaveSchoolTime() {
        return leaveSchoolTime;
    }

    public void setLeaveSchoolTime(Date leaveSchoolTime) {
        this.leaveSchoolTime = leaveSchoolTime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Timestamp getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Timestamp joinTime) {
        this.joinTime = joinTime;
    }

    public Integer getOnJobFlag() {
        return onJobFlag;
    }

    public void setOnJobFlag(Integer onJobFlag) {
        this.onJobFlag = onJobFlag;
    }

    public Timestamp getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Timestamp leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getEmpImg() {
        return empImg;
    }

    public void setEmpImg(String empImg) {
        this.empImg = empImg;
    }

    public Timestamp getLoginDatetime() {
        return loginDatetime;
    }

    public void setLoginDatetime(Timestamp loginDatetime) {
        this.loginDatetime = loginDatetime;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public Timestamp getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Timestamp updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}
