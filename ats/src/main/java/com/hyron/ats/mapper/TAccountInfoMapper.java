package com.hyron.ats.mapper;

import java.util.List;

import com.hyron.ats.pojo.TAccountInfo;

public interface TAccountInfoMapper {

	/**
	 * 
	 * @param example
	 * @return
	 */
	TAccountInfo selectById(String id);
	
	List<TAccountInfo> selectAll();
}
