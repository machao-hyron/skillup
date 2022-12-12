package com.hyron.ats.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeSearchOutDto {

	/**
	 * 工号
	 */
	private String employeeId;
	
	/**
	 * 部门ID
	 */
	private String departmentId;
	
	/**
	 * 姓名
	 */
	private String employeeName;
	
	/**
	 * 项目ID
	 */
	private String projectId;
	
	/**
	 * 项目名
	 */
	private String projectName;
	
	/**
	 * 项目Leader
	 */
	private String rojectLeaderId;

	/**
	 * 技能
	 */
	private String skill;

}
