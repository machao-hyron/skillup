package com.example.demo.controller;

import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.service.InitService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class InitController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private InitService initService;

    @GetMapping(value = "list-init")
    public String init(Model model) {

        logger.info("InitController.init开始");

        TUserInfoExample example = new TUserInfoExample();
        List<TUserInfo> tUserInfo = initService.init();
        model.addAttribute("tUserInfo",tUserInfo);
        return "list-init";
    }
}
