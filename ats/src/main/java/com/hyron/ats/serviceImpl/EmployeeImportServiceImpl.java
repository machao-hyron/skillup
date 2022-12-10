package com.hyron.ats.serviceImpl;

import com.hyron.ats.mapper.EmployeeImportMapper;
import com.hyron.ats.pojo.Employee;
import com.hyron.ats.service.EmployeeImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImportServiceImpl implements EmployeeImportService {

    @Autowired
    private EmployeeImportMapper employeeImportMapper;

    @Override
    public List<Employee> findAll() {
        return employeeImportMapper.findAll();
    }

    @Override
    public void setDataFromExcel(List<Employee> employees) {
        employeeImportMapper.setDataFromExcel(employees);
    }
}
