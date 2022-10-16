package com.example.demo.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TUserInfo;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.ListInitService;

@Service
public class ListinitServiceimpl implements ListInitService {

	@Autowired
	private TUserInfoMapper userInfoMapper;
	
	
	@Override
	public TUserInfo selectById(Integer id){
		return userInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<TUserInfo> selectAll() {
		List<TUserInfo> tUserInfo = userInfoMapper.selectAll();
		return tUserInfo;
	}

}
