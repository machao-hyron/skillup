package com.example.demo.mapper;

import com.example.demo.entity.TUserInfo;

import java.util.List;

public interface PeopleMapper {
    List<TUserInfo> findAll();
}
