package com.hyron.ats.service;

import com.hyron.ats.pojo.Employee;

import java.util.List;

public interface EmployeeImportService {
    List<Employee> findAll();
    void setDataFromExcel(List<Employee> employees);
    List<Employee> findByIdAndName(String employeeId,String departmentId,String name);
}


