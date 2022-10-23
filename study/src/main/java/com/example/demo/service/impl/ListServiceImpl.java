package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TUserInfo;
import com.example.demo.mapper.ListMapper;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.ListService;

@Service
public class ListServiceImpl implements ListService{
	@Autowired
	private ListMapper userInfoListMapper;
	
	public List<TUserInfo> selectinfo(){
		return userInfoListMapper.selectinfo();
	}
}
