package com.hyron.ats.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hyron.ats.dto.LoginDto;
import com.hyron.ats.service.LoginService;
;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping(value = "login")
	public String login() {
		return "login";
	}

	@GetMapping("EmployeeImportAndExport")
	public String Employee(){
		return "EmployeeImportAndExport";
	}

	@PostMapping(value = "login")
	public String loginbtn(LoginDto dto, final Model model) {

		if (StringUtils.isNotEmpty(dto.getId()) && StringUtils.isNotBlank(dto.getPwd())) {
			if (loginService.loginAcntCheck(dto)) {
				return "redirect:EmployeeImportAndExport";
			}
		}
		model.addAttribute("errorMsg", "请输入正确的用户名与密码。");
		return "login";

	}
}
