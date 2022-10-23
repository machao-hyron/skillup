package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TUserInfo;
import com.example.demo.service.ListService;


@RestController
public class ListController {
	
	@Autowired
	private ListService userInfo;

	@GetMapping(value = "list-init")
	public List<TUserInfo> listinit() {
		return userInfo.selectinfo();
	}

}
