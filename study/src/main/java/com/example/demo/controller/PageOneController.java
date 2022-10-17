package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.entity.TUserInfo;
import com.example.demo.service.PageOneService;

@Controller
public class PageOneController {

	@Autowired
	private PageOneService pageOneService;

	@GetMapping(value = "pageone")
	public String showUserInfo(final Model model) {
		List<TUserInfo> userInfoList = new ArrayList<TUserInfo>();
		//ユーザ情報取得 
		userInfoList = pageOneService.getUSerInfo();
		//そのまま画面への出力
		model.addAttribute("userInfoList", userInfoList);
		return "pageone";
	}
}
