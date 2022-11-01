package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.entity.TUserInfo;
import com.example.demo.service.InitService;

@Controller
public class InitController {

	@Autowired
	private InitService initService;

	@GetMapping(value = "init")
	public String init(Model model) {
		List<TUserInfo> tUserInfo = initService.initSelect();
		model.addAttribute("tUserInfo",tUserInfo);
		return "init";
	}
}
