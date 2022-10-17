package com.example.demo.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.PageOneService;
@Service
public class PageOneServiceImpl implements PageOneService {

	@Autowired
	private TUserInfoMapper userInfoMapper;
	

	@Override
	public List<TUserInfo> getUSerInfo() {
		// TODO Auto-generated method stub
		TUserInfoExample example = new TUserInfoExample();
		example.createCriteria();
		List<TUserInfo> userInfoList = userInfoMapper.selectByExample(example);
		if(!CollectionUtils.isEmpty(userInfoList)) {
			return userInfoList;
		}
		return userInfoList;
	}
}
