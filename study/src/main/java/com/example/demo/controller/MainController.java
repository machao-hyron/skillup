package com.example.demo.controller;


import com.example.demo.entity.TUserInfo;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    /**
     * 进入首页，并查询所有用户信息
     * @param model
     * @return "main"
     */
    @GetMapping(value = "main")
     public String Main(Model model){
        List<TUserInfo> tUserInfo = mainService.queryAll();
        model.addAttribute("tUserInfo",tUserInfo);
        return "main";
     };
}
