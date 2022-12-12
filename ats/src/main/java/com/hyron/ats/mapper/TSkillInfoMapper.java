package com.hyron.ats.mapper;

import java.util.List;

import com.hyron.ats.dto.EmployeeSearchInDto;
import com.hyron.ats.pojo.TSkillInfo;

public interface TSkillInfoMapper {

	TSkillInfo selectById(String id);
	
	List<TSkillInfo> selectAll(EmployeeSearchInDto inDto);
}
