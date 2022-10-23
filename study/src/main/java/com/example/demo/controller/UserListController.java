package com.example.demo.controller;

import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserListController {
    @Autowired
    private  UserListService  userListService;

    @GetMapping(value = "list-init")
    public String selectall(Model model){
        List<TUserInfo> userlist = userListService.selectall();
        model.addAttribute("tUserInfo",userlist);
        return "list-init";
    }

}
