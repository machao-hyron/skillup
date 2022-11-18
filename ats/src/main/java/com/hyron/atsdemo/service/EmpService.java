package com.hyron.atsdemo.service;

import com.hyron.atsdemo.pojo.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> findAll();
    void setDataFromExcel(List<Emp> emps);
}
