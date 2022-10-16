package com.example.demo.service;

import com.example.demo.dto.LoginDto;
import com.example.demo.entity.TUserInfo;
import com.example.demo.util.Result;

public interface LoginService {

	/**
	 * 登録アカウントは存在するかをチェックする
	 * 
	 * @param dto 入力内容
	 * @return true->チェックOK；fals->チェックfalse；
	 */
	boolean loginAcntCheck(LoginDto dto);

	Result loginSelectOne(LoginDto dto);
}
