package com.longyue.orvetimeservice.mapper;

import com.github.yulichang.base.MPJBaseMapper;
import com.longyue.orvetimeservice.domain.TEmployeeInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TEmployeeInfoMapper extends MPJBaseMapper<TEmployeeInfo> {

    List<TEmployeeInfo> getTEmployeeInfoList();
}




