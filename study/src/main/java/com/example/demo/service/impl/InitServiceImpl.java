package com.example.demo.service.impl;

import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.InitService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class InitServiceImpl implements InitService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private TUserInfoMapper userInfoMapper;

    @Override
    public List<TUserInfo> init() {

        logger.info("InitService.init开始");

        TUserInfoExample example = new TUserInfoExample();
        List<TUserInfo> tUserInfo = userInfoMapper.selectByExample(example);
        logger.info("userinfoSize:" + tUserInfo.size());
        return tUserInfo;
    }
}
