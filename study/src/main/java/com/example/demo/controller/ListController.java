package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.TUserInfo;
import com.example.demo.service.ListInitService;

@Controller
public class ListController {
    private ListInitService initService;

    @Autowired
    public void setInitService(ListInitService initService){
        this.initService = initService;
    }
    @GetMapping(value = "list-init")
    public String showList (Model model){
        //获取所有的用户然后由Thymeleaf渲染数据
        List<TUserInfo> userInfoList= initService.sellectAll();
        model.addAttribute("userInfoList", userInfoList);
        return "list-init";
    }
    @PostMapping(value = "list-init")
    public String insertUser(UserDto userDto,final Model model){
        initService.insertUser(userDto);
         return "redirect:list-init";
    }
}
