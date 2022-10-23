package com.example.demo.service;

import java.util.List;


import com.example.demo.dto.ListDto;
import com.example.demo.entity.TUserInfo;

public interface ListService {

	
	boolean toNextPage(ListDto dto);
	
	
	
	List<TUserInfo> getUSerInfo();
}