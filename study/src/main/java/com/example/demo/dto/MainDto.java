package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MainDto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /** ID */
    private String id;

    /** NAME */
    private String name;

    /** AGE */
    private String age;

    /** SEX */
    private String sex;
}
