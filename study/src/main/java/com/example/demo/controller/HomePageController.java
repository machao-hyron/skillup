package com.example.demo.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.HomePageDto;
import com.example.demo.service.HomePageService;


@Controller
public class HomePageController {

	@Autowired
	private HomePageService homePageService;

	@GetMapping(value = "homePage")
	public String toHomePage() {
		return "homePage";
	}

	@PostMapping(value = "homePage")
	public String homePagebtn(HomePageDto dto, final Model model) {

		if (StringUtils.isNotEmpty(dto.getName()) && StringUtils.isNotBlank(dto.getBirthNum())
				&& StringUtils.isNotBlank(dto.getTelNum())) {
			// 入力個人情報が正しい場合、次画面へ遷移
			if (homePageService.toNextPage(dto)) {
				// TODO 検索一覧画面へ遷移する
						return "redirect:nextPage";
			}
		}
		model.addAttribute("errorMsg", "すみません、次画面へ遷移できませんよ！");
		// アカウントが間違う場合、エラーメッセージ表示する
		return "homePage";

	}
}
