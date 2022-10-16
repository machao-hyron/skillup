package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.TUserInfo;
import com.example.demo.service.ListInitService;


@Controller
public class ListInitController {

	@Autowired
	private ListInitService listInitService;
	
	/**
	 * パラメータを取得する
	 */
    @GetMapping(value = "listInit")
    public String init(Model model) {
        List<TUserInfo> tUserInfo = listInitService.selectAll();
        model.addAttribute("tUserInfo",tUserInfo);
        return "listInit";
    }
}
