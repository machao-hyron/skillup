package com.hyron.ats.mapper;

import java.util.List;

import com.hyron.ats.dto.EmployeeSearchInDto;
import com.hyron.ats.pojo.EmployeeSearchInfo;
import com.hyron.ats.pojo.TEmployeeInfo;

public interface TEmployeeInfoMapper {

	TEmployeeInfo selectById(String id);
	
	List<TEmployeeInfo> selectAll(EmployeeSearchInDto indto);
	
	List<EmployeeSearchInfo> selectjoin(EmployeeSearchInDto indto);
}
