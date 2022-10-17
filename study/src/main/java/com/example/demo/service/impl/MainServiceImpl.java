package com.example.demo.service.impl;

import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;
import com.example.demo.service.MainService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class MainServiceImpl implements MainService {

    @Resource
    private TUserInfoMapper userInfoMapper;

    /**
     * 查询Table(t_user_info)所有信息
     * @return tUserInfo
     */
    @Override
    public List<TUserInfo> queryAll() {
        TUserInfoExample userInfoExample = new TUserInfoExample();
        List<TUserInfo> tUserInfo = userInfoMapper.selectByExample(userInfoExample);
        return tUserInfo;
    }
}
