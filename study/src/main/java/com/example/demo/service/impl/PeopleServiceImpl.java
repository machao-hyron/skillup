package com.example.demo.service.impl;

import com.example.demo.entity.TUserInfo;
import com.example.demo.mapper.PeopleMapper;
import com.example.demo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    PeopleMapper peopleMapper;


    @Override
    public List<TUserInfo> findAll() {
        return peopleMapper.findAll();
    }
}
