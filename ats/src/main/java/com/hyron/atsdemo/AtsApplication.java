package com.hyron.atsdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.hyron.atsdemo.mapper")
public class AtsApplication {
    public static void main(String[] args) {
        SpringApplication.run(AtsApplication.class, args);
    }

}
