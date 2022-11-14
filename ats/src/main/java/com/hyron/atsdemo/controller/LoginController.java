package com.hyron.atsdemo.controller;

import com.hyron.atsdemo.pojo.Number;
import com.hyron.atsdemo.service.NumberService;
import com.hyron.atsdemo.until.MD5Utils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.servlet.http.HttpSession;

@Controller
@Slf4j
public class LoginController {

    @Autowired
    NumberService numberService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @GetMapping("empall")
    public String empall(){
        return "empall";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(Number number,HttpSession session, RedirectAttributes attributes){
        //MD5加密
        log.info(number.getJobId());
        log.info(number.getPassword());
        number.setPassword(MD5Utils.code(number.getPassword()));
        log.info(number.getPassword());
        Number loginUser = numberService.login(number);
        if (loginUser != null){
                loginUser.setPassword(null);
                session.setAttribute("number", loginUser);
                return "redirect:empall";
            } else {
                attributes.addFlashAttribute("message", "用户名或密码错误");
                return "redirect:login";
            }

        }

    }
