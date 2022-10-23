package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.demo.dto.ListDto;
import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;

import com.example.demo.service.ListService;

@Service//如果 Web 应用程序采用了经典的三层分层结构的话，最好在持久层、业务层和控制层分别采用 @Repository、@Service 和 @Controller 对分层中的类进行注释，而用 @Component 对那些比较中立的类进行注释。 
public class ListServiceImpl implements ListService {

	@Autowired//自动装配指的就是使用将 Spring 容器中的 bean 自动的和我们需要这个 bean 的类组装在一起
	private TUserInfoMapper userInfoMapper;

	@Override//@Override 注解是用来指定方法重写的，只能修饰方法并且只能用于方法重写
	public List<TUserInfo> getUSerInfo() {
		TUserInfoExample example = new TUserInfoExample();
		example.createCriteria();
		// データベースのヨーザー情報取得
		List<TUserInfo> userInfoList = userInfoMapper.selectByExample(example);
		if (!CollectionUtils.isEmpty(userInfoList)) {
			return userInfoList;
		}
		return userInfoList;
	}

	@Override
	public boolean toNextPage(ListDto dto) {
		
		return true;
	}

}