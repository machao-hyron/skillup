package com.example.demo.service.impl;

import com.example.demo.entity.TUserInfo;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuInfoServiceImpl implements StuInfoService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<TUserInfo> getStuInfo(){
        return studentMapper.getStuInfo();
    }

}
