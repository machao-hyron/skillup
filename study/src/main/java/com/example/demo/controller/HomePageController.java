package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.entity.TUserInfo;
import com.example.demo.service.HomePageService;

@Controller
public class HomePageController {

	@Autowired
	private HomePageService homePageService;

	@GetMapping(value = "homePage")
	public String showUserInfo(final Model model) {
		List<TUserInfo> userInfoList = new ArrayList<TUserInfo>();
		//ユーザ情報取得 
		userInfoList = homePageService.getUSerInfo();
		//そのまま画面への出力
		model.addAttribute("userInfoList", userInfoList);
		// 文字列形式変換後,画面への出力
		StringBuilder allUserInfo = new StringBuilder();
		String resultString = "";
		for (TUserInfo userInfo : userInfoList) {
			allUserInfo.append(userInfo);
			allUserInfo.append(" ");
		}
		resultString = allUserInfo.toString();
		model.addAttribute("resultString", resultString);
		return "homePage";
	}

//	@PostMapping(value = "homePage")
//	public String homePagebtn(HomePageDto dto, final Model model) {
//
//		if (StringUtils.isNotEmpty(dto.getName()) && StringUtils.isNotBlank(dto.getBirthNum())
//				&& StringUtils.isNotBlank(dto.getTelNum())) {
//			// 入力個人情報が正しい場合、次画面へ遷移
//			if (homePageService.toNextPage(dto)) {
//				// TODO 検索一覧画面へ遷移する
//						return "redirect:nextPage";
//			}
//		}
//		model.addAttribute("errorMsg", "すみません、次画面へ遷移できませんよ！");
//		// アカウントが間違う場合、エラーメッセージ表示する
//		return "homePage";
//
//	}
}
