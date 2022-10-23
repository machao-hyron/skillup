package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.TUserInfo;

@Mapper
public interface ListMapper {
	List<TUserInfo> selectinfo();
}
