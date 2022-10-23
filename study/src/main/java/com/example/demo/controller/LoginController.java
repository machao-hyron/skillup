package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.LoginDto;
import com.example.demo.service.LoginService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping(value = "login")
	public String login() {
		return "login";
	}

	/**
	 * 带数据的请求
	 * @param dto
	 * @param model
	 * @return
	 */
	@PostMapping(value = "login")
	public String loginbtn(LoginDto dto, final Model model, HttpSession session) {

		if (StringUtils.isNotEmpty(dto.getId()) && StringUtils.isNotBlank(dto.getPwd())) {
			// ログインアカウントが認証正しい場合、次画面へ遷移
			if (loginService.loginAcntCheck(dto)) {
				session.setAttribute("id",dto.getId());
			    log.info("登录成功，登录ID为",dto.getId());
				// TODO 検索一覧画面へ遷移する
				return "redirect:/list-init";
			}
		}
		model.addAttribute("errorMsg", "正しいアカウントを入力してください。(例：ID:1  PWD:123456)");
		// アカウントが間違う場合、エラーメッセージ表示する
		return "login";

	}
}
