package com.example.demo.controller;

import com.example.demo.entity.TUserInfo;
import com.example.demo.service.StuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StuInfoController {
    @Autowired
    private StuInfoService stuInfoService;

    @GetMapping("/stuInfo")
    public List<TUserInfo> getStuInfo() {
        List<TUserInfo> stuInfoList = stuInfoService.getStuInfo();
        return stuInfoList;
    }

}


