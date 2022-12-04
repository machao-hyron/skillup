package com.hyron.ats.pojo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TAccountInfo {

	//工号
	private String employeeId;
	//邮箱
	private String eMail;
	//密码
	private String psw;
	//登录时间
	private Date createTime;
	//登录者
	private String createUserId;
	//更新时间
	private Date updateTime;
	//更新者
	private String updateUserId;
		
}
