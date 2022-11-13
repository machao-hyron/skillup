package com.hyron.atsdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


public class Number {

    private String jobId;
    private String mail;
    private String password;
    private Timestamp loginDatetime;
    private String loginUser;
    private Timestamp updateDatetime;
    private String updateUser;

    public Number() {
    }

    public Number(String jobId, String mail, String password, Timestamp loginDatetime, String loginUser, Timestamp updateDatetime, String updateUser) {
        this.jobId = jobId;
        this.mail = mail;
        this.password = password;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
