package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.TUserInfo;

public interface InitService {

	/**
	 * 登録アカウントは存在するかをチェックする
	 * 
	 * @param dto 入力内容
	 * @return true->チェックOK；fals->チェックfalse；
	 */
	List<TUserInfo> initSelect();
}
