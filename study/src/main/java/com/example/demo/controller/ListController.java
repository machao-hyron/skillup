package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.TUserInfo;
import com.example.demo.service.ListService;


@Controller//采用@Contoller注解的方式，可以使接口的定义更加简单
public class ListController {

	@Autowired//自动装配
	private ListService listService; 
	//@RequestMapping(value = "list-init")
	//@PostMapping(value = "list-init")提交
    //@PutMapping(value = "list-init")修改
	//@DelectMapping("value = "list-init")删除
	@GetMapping(value = "list-init")//@getMapping = @requestMapping(method = RequestMethod.GET)。查询
	public String showUserInfo(final Model model) {
		List<TUserInfo> userInfoList = new ArrayList<TUserInfo>();
		//ユーザ情報取得 
		userInfoList = listService.getUSerInfo();
		model.addAttribute("userInfoList", userInfoList);
		
		return "list-init";
	}
	
}
