package com.hyron.atsdemo.mapper;

import com.hyron.atsdemo.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    List<Emp> findAll();
    void setDataFromExcel(Emp emp);
}
