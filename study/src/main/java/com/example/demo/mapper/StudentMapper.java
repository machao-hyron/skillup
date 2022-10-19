package com.example.demo.mapper;

import com.example.demo.entity.TUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {
    List<TUserInfo> getStuInfo();
}