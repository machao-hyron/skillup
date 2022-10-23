package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserMsg;

public interface MsgListService {

	/**
	 * 查找所有同事信息
	 * @return 同事信息集合
	 */
    List<UserMsg> selectAll();
}
