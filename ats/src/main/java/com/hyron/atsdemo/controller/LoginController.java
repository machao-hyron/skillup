package com.hyron.atsdemo.controller;

import com.hyron.atsdemo.pojo.Number;
import com.hyron.atsdemo.service.NumberService;
import com.hyron.atsdemo.until.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private NumberService numberService;

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @PostMapping("login")
    public String login(Number number,HttpSession session, RedirectAttributes attributes){
        //MD5加密
        number.setPassword(MD5Utils.code(number.getPassword()));
            Number loginUser = numberService.login(number);
            if (loginUser != null){
                loginUser.setPassword(null);
                session.setAttribute("number", loginUser);
                return "/index";
            } else {
                attributes.addFlashAttribute("message", "用户名或密码错误");
                return "redirect:/login";
            }
        }

    }
