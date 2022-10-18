package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.entity.TUserInfo;
import com.example.demo.service.ListService;


@Controller
public class ListController {

	@Autowired
	private ListService listService;

	@GetMapping(value = "list-init")
	public String showUserInfo(final Model model) {
		List<TUserInfo> userInfoList = new ArrayList<TUserInfo>();
		//ユーザ情報取得 
		userInfoList = listService.getUSerInfo();
		//そのまま画面への出力
		model.addAttribute("userInfoList", userInfoList);
		
		return "list-init";
	}
	
}
