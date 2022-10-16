package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class LoginDto implements Serializable{

	private static final long serialVersionUID = 1L;

	/** ID */
	private String id;
	
	/** PWD */
	private String pwd;
	
}
