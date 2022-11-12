package com.hyron.atsdemo.service.serviceImpl;

import com.hyron.atsdemo.mapper.NumberMapper;
import com.hyron.atsdemo.pojo.Number;
import com.hyron.atsdemo.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumberServiceImpl implements NumberService {

    @Autowired
    NumberMapper numberMapper;

    @Override
    public Number login(Number number) {
        return numberMapper.findByJobNoAndPassword(number);
    }


}
