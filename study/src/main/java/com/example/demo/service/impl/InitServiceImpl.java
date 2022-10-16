package com.example.demo.service.impl;

import com.example.demo.dto.InitDto;
import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.InitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class InitServiceImpl implements InitService {

    @Autowired
    private TUserInfoMapper userInfoMapper;

    @Override
    public String init() {
        TUserInfoExample example = new TUserInfoExample();
        InitDto initDto = new InitDto();
        List<TUserInfo> userInfoList = userInfoMapper.selectByExample(example);
        log.info("userinfo:" + userInfoList.toString());
        return userInfoList.toString();
    }
}
