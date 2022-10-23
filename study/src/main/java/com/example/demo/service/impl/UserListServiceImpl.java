package com.example.demo.service.impl;

import com.example.demo.entity.TUserInfo;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserListServiceImpl implements UserListService {
    @Autowired
    TUserInfoMapper tUserInfoMapper;


    @Override
    public List<TUserInfo> selectall() {

        return tUserInfoMapper.selectall();
    }
}
