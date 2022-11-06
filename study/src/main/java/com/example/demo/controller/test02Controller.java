package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.LoginDto;
import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.service.UserdataService;

@Controller
public class test02Controller {

	@Autowired
	private UserdataService test02Service;

	@GetMapping(value = "test02")
	public String userdata(final Model model) {

        TUserInfoExample example = new TUserInfoExample();
        List<TUserInfo> tUserInfo = test02Service.findAll();
        String kougo=tUserInfo.get(0).getPwd();
        String sex=tUserInfo.get(0).getSex();
        String name=tUserInfo.get(0).getUserName();
        model.addAttribute("tUserInfo",tUserInfo);
        model.addAttribute("kougo",kougo);
        model.addAttribute("sex",sex);
        model.addAttribute("tUserInfo",tUserInfo);
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getSex());
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getPwd());
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getUserName());
		return "test02";
	}
}