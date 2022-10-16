package com.example.demo.service.impl;

import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.IndexService;
import com.example.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IndexserviceImpl implements IndexService {
    @Autowired
    private TUserInfoMapper userInfoMapper;

    /**
     * 首页数据展示业务层处理
     * @return
     */
    @Override
    public Result toIndex() {
        List<TUserInfo> userInfos = userInfoMapper.selectall();
        if (userInfos == null || userInfos.isEmpty()){
            return Result.error().message("暂未发现数据");
        }else {
            return Result.ok().data("userInfos",userInfos);
        }
    }
}
