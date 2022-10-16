package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.HomePageDto;
import com.example.demo.entity.TUserInfo;

public interface HomePageService {

	/**
	 * 次ページへ遷移
	 * 
	 * @param dto 入力内容
	 * @return true->チェックOK；false->チェックfalse；
	 */
	boolean toNextPage(HomePageDto dto);
	
	
	/**
	 * 
	 * 個人情報取込
	 * 
	 */
	
	List<TUserInfo> getUSerInfo();
}
