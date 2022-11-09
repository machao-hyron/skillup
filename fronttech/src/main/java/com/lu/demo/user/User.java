package com.lu.demo.user;


import lombok.Data;

@Data
public class User {
    private String userId;
    private String name;
    private String sex;
    private Integer age;

    public User() {
    }

    public User(String userId, String name, Integer age, String sex) {
        this.userId = userId;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public User(String userId, String name, String sex) {
        this.userId = userId;
        this.name = name;
        this.sex = sex;
    }
}
