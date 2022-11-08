package com.lu.demo.user;


import lombok.Data;

@Data
public class User {
    private String userId;
    private String name;
    private Integer age;
    private String sex;

    public User() {
    }

    public User(String userId, String name, Integer age, String sex) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public User(String userId, String name, String sex) {
        this.userId = userId;
        this.name = name;
        this.sex = sex;
    }
}
