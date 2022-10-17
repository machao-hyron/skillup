package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.TUserInfo;

public interface TuserInfoService {
	
	List<TUserInfo> findAll();

	TUserInfo selectByPrimaryKey(Integer userId);

	void updateByPrimaryKeySelective(TUserInfo tUserInfo);

	void deleteByPrimaryKey(Integer userId);

	void insert(TUserInfo tUserInfo);
}
