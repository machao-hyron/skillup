package com.hyron.ats.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TWorkExperience {

	/**
	 * 工号
	 */
	private String employeeId;
	
	/**
	 * From年
	 */
	private String fromYear;
	
	/**
	 * To年
	 */
	private String toYear;
	
	/**
	 * 职位
	 */
	private String position;

	/**
	 * 登录时间
	 */
	private String createTime;
	
	/**
	 * 登录者
	 */
	private String createUserId;
	
	/**
	 * 更新时间
	 */
	private String updateTime;
	
	/**
	 * 更新者
	 */
	private String updateUserId;
}
