package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.TuserInfoService;

@Service
public class TUserInfoServiceImpl implements TuserInfoService {

	@Autowired
	private TUserInfoMapper userInfoMapper;

	
	@Override
	public List<TUserInfo> findAll() {
		TUserInfoExample example = new TUserInfoExample();
		List<TUserInfo> userInfoList = userInfoMapper.selectByExample(example);
		return userInfoList;
	}

	@Override
	public TUserInfo selectByPrimaryKey(Integer userId) {
		return userInfoMapper.selectByPrimaryKey(userId);
	}

	@Override
	public void updateByPrimaryKeySelective(TUserInfo tUserInfo) {
		userInfoMapper.updateByPrimaryKeySelective(tUserInfo);
	}

	@Override
	public void deleteByPrimaryKey(Integer userId) {
		userInfoMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public void insert(TUserInfo tUserInfo) {
		userInfoMapper.insert(tUserInfo);
	}


}
