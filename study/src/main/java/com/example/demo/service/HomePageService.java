package com.example.demo.service;

import com.example.demo.dto.HomePageDto;

public interface HomePageService {

	/**
	 * 次ページへ遷移
	 * 
	 * @param dto 入力内容
	 * @return true->チェックOK；false->チェックfalse；
	 */
	boolean toNextPage(HomePageDto dto);
}
