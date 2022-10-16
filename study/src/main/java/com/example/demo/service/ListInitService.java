package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.TUserInfo;

public interface ListInitService {

	public TUserInfo selectById(Integer id);
	
	public List<TUserInfo> selectAll();
}
