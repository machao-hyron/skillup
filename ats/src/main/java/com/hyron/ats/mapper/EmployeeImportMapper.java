package com.hyron.ats.mapper;

import com.hyron.ats.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;
@Mapper
public interface EmployeeImportMapper {
    List<Employee> findAll();
    void setDataFromExcel(List<Employee> employees);
    List<Employee> findByIdAndName(@Param("employeeId") String employeeId,
                                   @Param("departmentId") String departmentId,
                                   @Param("employeeName") String employeeName);

    //public int update(Employee employee);
}
