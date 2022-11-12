package com.hyron.atsdemo.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Number {
    private String jobNo;
    private String mail;
    private String password;
    private Timestamp loginDateime;
    private String loginUser;
    private Timestamp updateDateime;
    private String updateUser;

    public Number() {
    }

    public Number(String jobNo, String mail, String password) {
        this.jobNo = jobNo;
        this.mail = mail;
        this.password = password;
    }

    public Number(String jobNo, String mail, String password, Timestamp loginDateime, String loginUser, Timestamp updateDateime, String updateUser) {
        this.jobNo = jobNo;
        this.mail = mail;
        this.password = password;
        this.loginDateime = loginDateime;
        this.loginUser = loginUser;
        this.updateDateime = updateDateime;
        this.updateUser = updateUser;
    }
}
