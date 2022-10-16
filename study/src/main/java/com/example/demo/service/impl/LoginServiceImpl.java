package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.util.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.demo.dto.LoginDto;
import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.LoginService;
import org.springframework.util.ObjectUtils;

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

	/**
	 * 查询用户的数据
	 * @return
	 */
	public Result loginSelectOne(LoginDto dto){
		//用户名输入规范check
		if (!StringUtils.isNumeric(dto.getId())){
			return Result.error().message("用户名输入错误");
		}
		//查询用户信息
		TUserInfo userInfo = userInfoMapper.selectByPrimaryKey(Integer.valueOf(dto.getId()));

		//用户信息不为空，返回成功
		if (!ObjectUtils.isEmpty(userInfo)){
			return Result.ok().data("userInfo",userInfo);
			//用户信息为空，返回error
		}else {
			return Result.error().message("用户名不存在");
		}
	}
}
