package com.lu.demo.controller;

import com.lu.demo.commen.R;
import com.lu.demo.service.UserService;
import com.lu.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller("/index")
public class UserConller {
    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public String findAll(Model model){
        List<User> userList = userService.findAll();
        model.addAttribute("userList",userList);
        return "/index";
    }

}
