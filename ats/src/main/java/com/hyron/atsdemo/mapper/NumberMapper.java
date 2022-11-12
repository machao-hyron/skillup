package com.hyron.atsdemo.mapper;

import com.hyron.atsdemo.pojo.Number;

public interface NumberMapper {
    Number findByJobNoAndPassword(Number number);
}
