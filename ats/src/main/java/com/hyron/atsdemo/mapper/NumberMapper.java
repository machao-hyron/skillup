package com.hyron.atsdemo.mapper;

import com.hyron.atsdemo.pojo.Number;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NumberMapper {

    Number findByJobNoAndPassword(Number number);
}
