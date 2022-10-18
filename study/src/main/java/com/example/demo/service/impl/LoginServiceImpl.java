package com.example.demo.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.demo.dto.LoginDto;
import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.LoginService;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource
	private TUserInfoMapper userInfoMapper;

	@Override
	public boolean loginAcntCheck(LoginDto dto) {

		logger.info("LoginService.loginAcntCheck开始");
		
		TUserInfoExample example = new TUserInfoExample();
		example.createCriteria().andUserIdEqualTo(Integer.parseInt(dto.getId())).andPwdEqualTo(dto.getPwd());
		List<TUserInfo> userInfoList = userInfoMapper.selectByExample(example);
		if(!CollectionUtils.isEmpty(userInfoList)) {
			return true;
		}
		return false;
	}

}
