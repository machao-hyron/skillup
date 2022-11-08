package com.example.demo.service.impl;

import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.mapper.UserdataMapper;
import com.example.demo.service.UserdataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserdataServiceImpl implements UserdataService {

    @Autowired
    private TUserInfoMapper UserdataMapper;


    @Override
    public List<TUserInfo> findAll() {
        TUserInfoExample example = new TUserInfoExample();
        List<TUserInfo> temp = UserdataMapper.selectByExample(example);
        System.out.println("***************ser");
        System.out.println(temp.get(0).getSex());
        return temp;
    }
    @Override
    public List<TUserInfo> update1() {
    	 TUserInfoExample example = new TUserInfoExample();
         List<TUserInfo> temp = UserdataMapper.selectByExample(example);
         System.out.println("***************ser");
         System.out.println(temp.get(0).getSex());
         return temp;
    }
    
}
