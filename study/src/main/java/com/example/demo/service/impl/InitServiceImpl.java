package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.InitService;

@Service
public class InitServiceImpl implements InitService {
	
	@Autowired
	private TUserInfoMapper userInfoMapper;

	@Override
	public List<TUserInfo> initSelect() {
		List<TUserInfo> tUserInfo = userInfoMapper.initSelect();
        return tUserInfo;
	}

}
