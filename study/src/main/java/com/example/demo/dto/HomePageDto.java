package com.example.demo.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HomePageDto implements Serializable {
	/** 名前 */
	private String name;
	
	/** 生年月日 */
	private String birthNum;
	
	/** 電話番号 */
	private String telNum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthNum() {
		return birthNum;
	}

	public void setBirthNum(String birthNum) {
		this.birthNum = birthNum;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


}
