package com.hyron.ats.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TEmployeeInfo {
	/**
	 * 工号
	 */
	private String employeeId;
	
	/**
	 * 部门ID
	 */
	private String departmentId;
	
	/**
	 * 所属项目ID
	 */
	private String projectId;
	
	/**
	 * 姓名
	 */
	private String employeeName;
	
	/**
	 * 性别
	 * M:男性  F:女性
	 */
	private String employeeSex;
	
	/**
	 * 生年月日
	 * yyyy-mm-dd
	 */
	private String employeeBirth;
	
	/**
	 * 毕业年
	 * YYYY
	 */
	private String graduationYear;
	
	/**
	 * 毕业学校
	 */
	private String graduationUniversity;
	
	/**
	 * 入职年月日
	 * yyyy-mm-dd
	 */
	private String inductionDate;
	
	/**
	 * 在职Flg
	 * 1:在职  0:退职
	 */
	private String onJobFlg;
	
	/**
	 * 退职年月日
	 */
	private String resignationDate;
	
	/**
	 * 照片IMG
	 * 照片的URL
	 */
	private String employeeImg;
	
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
