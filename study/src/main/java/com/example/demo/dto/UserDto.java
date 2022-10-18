package com.example.demo.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserDto implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String userName;
    private Integer age;
    private String sex;
    private String memo;
    private String pwd;
}
