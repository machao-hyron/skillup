package com.example.demo.service;

import com.example.demo.entity.TUserInfo;

import java.util.List;

public interface MainService {

    /**
     * 查询Table(t_user_info)所有信息
     * @return TUserInfo
     */
    List<TUserInfo> queryAll();
}
