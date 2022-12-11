package com.hyron.ats.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TProjectInformation {

	/**
	 * 部门ID
	 */
	private String departmentId;
	
	/**
	 * 项目ID
	 */
	private String projectId;
	
	/**
	 * 项目名
	 */
	private String projectName;
	
	/**
	 * 项目LeaderID
	 */
	private String projectLeaderId;
	
	/**
	 * 项目统括ID
	 */
	private String projectGeneralId;
	
	/**
	 * 登录时间
	 */
	private String insertTime;
	
	/**
	 * 登录者
	 */
	private String insertPersonId;
	
	/**
	 * 更新时间
	 */
	private String updateTime;
	
	/**
	 * 更新者
	 */
	private String updatePersonId;
}
