package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.TUserInfo;

import java.util.List;

/**
 * @Author ZyaireShu
 * @Date 2022/10/17 21:18
 * @Version 1.0
 */
public interface ListInitService {
    /**
	 * 查询数据库中所有的数据
	 * 
	 * @return 包含所有数据的列表
	 */
    List<TUserInfo> sellectAll();

    /**
	 * 插入一个用户数据
	 * 
	 * @param dto 入力内容
	 * @return true->Insert OK；fals-> Insert fail;
	 */
    boolean insertUser(UserDto dto);
}
