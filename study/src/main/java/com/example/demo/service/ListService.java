package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TUserInfo;

@Service
public interface ListService {
    @Autowired
    public List<TUserInfo> selectinfo(); 
}
