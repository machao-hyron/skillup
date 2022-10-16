package com.example.demo.service;

import com.example.demo.dto.LoginDto;

public interface LoginService {

	/**
	 * 登録アカウントは存在するかをチェックする
	 * 
	 * @param dto 入力内容
	 * @return true->チェックOK；fals->チェックfalse；
	 */
	boolean loginAcntCheck(LoginDto dto);
}
