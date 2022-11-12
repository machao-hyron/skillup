package com.hyron.atsdemo.controller;

import com.hyron.atsdemo.pojo.Number;
import com.hyron.atsdemo.service.NumberService;
import com.hyron.atsdemo.until.MD5Utils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.servlet.http.HttpSession;

@Controller
@Slf4j
public class LoginController {

    @Autowired
    private NumberService numberService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/success")
    public String login(Number number,HttpSession session, RedirectAttributes attributes){
        //MD5加密
            log.info(number.getJobNo());
            log.info(number.getPassword());
            number.setPassword(MD5Utils.code(number.getPassword()));
            log.info(number.getPassword());
           // Number loginUser = numberService.login(number);
            if (numberService.login(number) != null){
                numberService.login(number).setPassword(null);
                session.setAttribute("number", numberService.login(number));
                return "success";
            } else {
                attributes.addFlashAttribute("message", "用户名或密码错误");
                return "redirect:login";
            }

        }

    }
