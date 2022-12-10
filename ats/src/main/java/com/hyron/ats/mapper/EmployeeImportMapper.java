package com.hyron.ats.mapper;

import com.hyron.ats.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface EmployeeImportMapper {
    List<Employee> findAll();
    void setDataFromExcel(List<Employee> employees);
    List<Employee> findByIdAndName(String employeeId,String departmentId,String name);
}
