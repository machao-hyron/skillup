package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.demo.dto.HomePageDto;
import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.HomePageService;

@Service
public class HomePageServiceImpl implements HomePageService {

	@Autowired
	private TUserInfoMapper userInfoMapper;

	@Override
	public List<TUserInfo> getUSerInfo() {
		TUserInfoExample example = new TUserInfoExample();
		example.createCriteria();
		// データベースのユーザーザ情報取得
		List<TUserInfo> userInfoList = userInfoMapper.selectByExample(example);
		if (!CollectionUtils.isEmpty(userInfoList)) {
			return userInfoList;
		}
		return userInfoList;
	}

	@Override
	public boolean toNextPage(HomePageDto dto) {
		// TODO Auto-generated method stub
		return true;
	}

}
