package com.example.demo.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitDto implements Serializable{

    /**
     * 初期信息表示DTO
     */
    private static final long serialVersionUID = 1L;
    /** ID */
    private String id;

    /** 姓名 */
    private String name;

    /** 年龄 */
    private String age;

    /** 性别 */
    private String sex;

    /** 密码 */
    private String psw;

}
