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
public class UserdataController {

	@Autowired
	private UserdataService UserdataService;

	@GetMapping(value = "userdata")
	public String userdata(final Model model) {

        TUserInfoExample example = new TUserInfoExample();
        List<TUserInfo> tUserInfo = UserdataService.findAll();
        model.addAttribute("tUserInfo",tUserInfo);
		return "userdata";
	}
}