package com.hyron.ats.service;

import java.util.List;

import com.hyron.ats.dto.EmployeeSearchInDto;
import com.hyron.ats.dto.EmployeeSearchOutDto;
import com.hyron.ats.pojo.EmployeeSearchInfo;

/**
 * 
 * @author 西野ななせ
 * @date: 2022-12-6 21:52:11
 * @version 1.0
 */
public interface EmployeeSearchService {
	
	/**
	 * 画面用情报取得
	 * @param dto
	 * @return
	 */
	List<EmployeeSearchOutDto> getEmployeeSearchInfoList(EmployeeSearchInDto inDto);
	
	/**
	 * 技能信息字符串取得
	 * @param id
	 * @return
	 */
	List<String> getSkill(List<EmployeeSearchInfo> EmployeeSearchInfoList);
}
