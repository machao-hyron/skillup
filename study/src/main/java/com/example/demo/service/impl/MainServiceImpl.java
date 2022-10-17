package com.example.demo.service.impl;

import com.example.demo.dto.MainDto;
import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainServiceImpl implements MainService {
    @Autowired
    private TUserInfoMapper userInfoMapper;

    @Override
    public List<MainDto> mainSearch() {
        List<MainDto> dtoList = new ArrayList<MainDto>();
        TUserInfoExample example = new TUserInfoExample();
        example.createCriteria();
        List<TUserInfo> userInfoList = userInfoMapper.selectByExample(example);
        for (TUserInfo item:userInfoList) {
            MainDto dto = new MainDto();
            dto.setName(item.getUserName());
            dto.setId(item.getUserId().toString());
            dto.setAge(item.getAge().toString());
            dto.setSex(item.getSex());
            dtoList.add(dto);
        }
        return dtoList;
    }

}
