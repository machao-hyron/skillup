package com.lu.demo.controller;
import com.lu.demo.service.UserService;
import com.lu.demo.user.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class UserConller {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/setUser",method = RequestMethod.POST)
    @ResponseBody
    public String setAll(@RequestBody User user){
        log.info("1");
        userService.setAll(user);
        return "success";
    }

    @GetMapping("/getUser")
    public String findAll(@RequestBody User user){
        List<User> all = userService.findAll();
        return "success";
    }

}
