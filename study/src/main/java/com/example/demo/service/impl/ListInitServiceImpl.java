package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.ListInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author ZyaireShu
 * @Date 2022/10/17 21:19
 * @Version 1.0
 */

@Service
public class ListInitServiceImpl implements ListInitService {
    @Autowired
    private TUserInfoMapper userInfoMapper;

    @Override
    public List<TUserInfo> sellectAll() {
        TUserInfoExample example = new TUserInfoExample();
        example.createCriteria();
        // List<TUserInfo> a = userInfoMapper.selectByExample(example);
        // a.stream().forEach(new Consumer<TUserInfo>() {
        //     @Override
        //     public void accept(TUserInfo tUserInfo) {
        //         System.out.println(tUserInfo.getUserName());
        //     }
        // });
        return  userInfoMapper.selectByExample(example);
    }

    @Override
    public boolean insertUser(UserDto dto) {
        // TODO Auto-generated method stub
        // 将dto转换为TuserInfo Bean
       TUserInfo tUserInfo = new TUserInfo();
       tUserInfo.setUserName(dto.getUserName());
       tUserInfo.setAge(dto.getAge());
       tUserInfo.setSex(dto.getSex());
       tUserInfo.setMemo(dto.getMemo());
       tUserInfo.setPwd(dto.getPwd());
       tUserInfo.setCreateDatetime(LocalDateTime.now());
       tUserInfo.setUpadteDatetime(new Date());
       // 返回受影响行数
       int i = userInfoMapper.insert(tUserInfo);
        return i==1;
    }
}
