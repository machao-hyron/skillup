package com.hyron.ats.service;

import com.hyron.ats.pojo.Employee;

import java.util.List;

public interface EmployeeImportService {
    public interface EmployeeService {
        List<Employee> findAll();
        void setDataFromExcel(List<Employee> employees);
    }

}
