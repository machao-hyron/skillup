package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.commen.LogBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.demo.dto.LoginDto;
import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private TUserInfoMapper userInfoMapper;

	@Override
	public boolean loginAcntCheck(LoginDto dto) {
		
		TUserInfoExample example = new TUserInfoExample();
		example.createCriteria().andUserIdEqualTo(Integer.parseInt(dto.getId())).andPwdEqualTo(dto.getPwd());
		List<TUserInfo> userInfoList = userInfoMapper.selectByExample(example);
		if(!CollectionUtils.isEmpty(userInfoList)) {
			return true;
		}
		return false;
	}

}
