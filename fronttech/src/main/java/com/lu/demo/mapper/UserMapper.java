package com.lu.demo.mapper;

import com.lu.demo.user.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
    List<User> setAll();
}
