package com.lu.demo.service.serviceImpl;

import com.lu.demo.mapper.UserMapper;
import com.lu.demo.service.UserService;
import com.lu.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public List<User> setAll(User user) {
        return userMapper.setAll(user);
    }
}
