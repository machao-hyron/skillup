package com.hyron.atsdemo.service.serviceImpl;

import com.hyron.atsdemo.mapper.EmpMapper;
import com.hyron.atsdemo.pojo.Emp;
import com.hyron.atsdemo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpMapper empMapper;

    @Override
    public List<Emp> findAll() {
        return empMapper.findAll();
    }

    @Override
    public void setDataFromExcel(List<Emp> emps) {
        emps.forEach(emp -> {
            empMapper.setDataFromExcel(emp);
        });
    }
}
