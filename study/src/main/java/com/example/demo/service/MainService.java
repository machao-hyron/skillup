package com.example.demo.service;

import com.example.demo.dto.MainDto;

import java.util.List;

public interface MainService {

    /**
     * 登録アカウントは存在するかをチェックする
     *
     * @param dto 入力内容
     * @return
     */
    List<MainDto> mainSearch();
}
