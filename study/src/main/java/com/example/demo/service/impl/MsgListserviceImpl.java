package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserMsg;
import com.example.demo.mapper.UserMsgMapper;
import com.example.demo.service.MsgListService;

@Service
public class MsgListserviceImpl implements MsgListService {
    @Autowired
    private UserMsgMapper userMsgMapper;

	@Override
	public List<UserMsg> selectAll() {

		List<UserMsg> userMsgList = userMsgMapper.selectAll();

        if (userMsgList == null || userMsgList.isEmpty()){
            return null;
        }else {
            return userMsgList;
        }
	}
}
