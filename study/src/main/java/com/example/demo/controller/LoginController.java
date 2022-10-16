package com.example.demo.controller;

import com.example.demo.constant.StringConstant;
import com.example.demo.entity.TUserInfo;
import com.example.demo.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.LoginDto;
import com.example.demo.service.LoginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.Map;

@Slf4j
@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping(value = "login")
	public String login() {
		return "login";
	}

	@PostMapping(value = "login")
	public String loginbtn(HttpServletRequest request, Model model, HttpSession session) {

		LoginDto dto = new LoginDto();
		dto.setId(request.getParameter("id"));
		dto.setPwd(request.getParameter("pwd"));
		log.info(dto.toString());
		//用户名密码检查

		if ( StringUtils.isEmpty(dto.getId()) || StringUtils.isEmpty(dto.getPwd())){
			model.addAttribute("errormsg","用户名或密码不能为空");
			return "login";
		}
		Result r = loginService.loginSelectOne(dto);

		log.info(r.toString());
		//service  返回值error
		if (r.getCode().equals(500)){
			model.addAttribute("errormsg",r.getMessage());
			return "login";
		}
		Map resultmap = r.getData();
		TUserInfo userInfo = (TUserInfo) resultmap.get("userInfo");
		//密码校验
		if (userInfo.getPwd().equals(dto.getPwd())){
			session.setAttribute(StringConstant.SESSION_USERINFO,userInfo);
			return "redirect:list-init";
		}else {
			model.addAttribute("errormsg","密码不正确");
			return "login";
		}
	}
}
