package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
        int age=tUserInfo.get(0).getAge();
        model.addAttribute("tUserInfo",tUserInfo);
        model.addAttribute("kougo",kougo);
        model.addAttribute("sex",sex);
        model.addAttribute("age",age);
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getSex());
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getPwd());
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getUserName());
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getAge());
        System.out.println("1111111111111111");
		return "test02";
	}
	@PostMapping(value = "test02")
	public String userdata2(final Model model) {

        TUserInfoExample example = new TUserInfoExample();
        List<TUserInfo> tUserInfo = test02Service.findAll();
        String kougo=tUserInfo.get(0).getPwd();
        String sex=tUserInfo.get(0).getSex();
        String name=tUserInfo.get(0).getUserName();
        int age=tUserInfo.get(0).getAge();
        model.addAttribute("tUserInfo",tUserInfo);
        model.addAttribute("kougo",kougo);
        model.addAttribute("sex",sex);
        model.addAttribute("age",age);
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getSex());
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getPwd());
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getUserName());
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getAge());
        System.out.println("222222222222222");
		return "test02";
		
	}
	@PostMapping(value = "test01")
	public String userdata3(final Model model) {

		TUserInfoExample example = new TUserInfoExample();
        List<TUserInfo> tUserInfo = test02Service.findAll();
        tUserInfo.remove(0);
        String kougo=tUserInfo.get(0).getPwd();
        String sex=tUserInfo.get(0).getSex();
        String name=tUserInfo.get(0).getUserName();
        int age=tUserInfo.get(0).getAge();
        model.addAttribute("tUserInfo",tUserInfo);
        model.addAttribute("kougo",kougo);
        model.addAttribute("sex",sex);
        model.addAttribute("age",age);
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getSex());
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getPwd());
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getUserName());
        System.out.println("***************");
        System.out.println(tUserInfo.get(0).getAge());
        System.out.println("333333333333333");
		return "test02";
		
	}
	
}