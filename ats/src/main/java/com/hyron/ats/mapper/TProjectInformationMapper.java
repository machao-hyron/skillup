package com.hyron.ats.mapper;

import java.util.List;

import com.hyron.ats.pojo.TProjectInformation;

public interface TProjectInformationMapper {

	List<TProjectInformation> selectAll(String departmentId);
}
