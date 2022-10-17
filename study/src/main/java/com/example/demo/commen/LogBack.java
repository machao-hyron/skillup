package com.example.demo.commen;

import java.lang.annotation.*;

@Documented//是否显示为注解
@Target(ElementType.METHOD)//@Target是表示注解的作用范围。ElementType.METHOD表示注解可用于方法
@Retention(RetentionPolicy.RUNTIME)//这个注解运行时有效
public @interface LogBack {
    String value() default "";
}