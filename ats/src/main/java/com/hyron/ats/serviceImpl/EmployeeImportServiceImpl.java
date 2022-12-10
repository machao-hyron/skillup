package com.hyron.ats.serviceImpl;

import com.hyron.ats.pojo.Employee;
import com.hyron.ats.service.EmployeeImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImportServiceImpl implements EmployeeImportService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAll() {
        return employeeMapper.findAll();
    }

    @Override
    public void setDataFromExcel(List<Employee> employees) {
        employeeMapper.setDataFromExcel(employees);
    }
}
