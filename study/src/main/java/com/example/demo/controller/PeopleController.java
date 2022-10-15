package com.example.demo.controller;

import com.example.demo.entity.TUserInfo;
import com.example.demo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @GetMapping("/people")
    public List<TUserInfo> findAll(){
        List<TUserInfo> people1=peopleService.findAll();
        return people1;
    }

}

