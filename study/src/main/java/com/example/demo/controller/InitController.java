package com.example.demo.controller;

import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Slf4j
public class InitController {
    @Resource
    TUserInfoMapper tUserInfoMapper;

    @GetMapping(value = "list-init")
    public String init(Model model) {
//        List<TUserInfo> tUserInfo = tUserInfoMapper.findALL();
        TUserInfoExample example = new TUserInfoExample();
        List<TUserInfo> tUserInfo = tUserInfoMapper.selectByExample(example);
        String str = tUserInfo.get(0).getUserName();
        log.info("11111111111" + tUserInfo.toString());
        log.info("str" + str);
        model.addAttribute("tUserInfo",tUserInfo);
        return "list-init";
    }
}
