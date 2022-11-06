package com.lu.demo.controller;
import com.lu.demo.service.UserService;
import com.lu.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller("/index")
public class UserConller {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/index",method = RequestMethod.POST)
    @ResponseBody
    public String findAll(@RequestParam User user){
        List<User> userList = userService.findAll();
        return "success";
    }

}
