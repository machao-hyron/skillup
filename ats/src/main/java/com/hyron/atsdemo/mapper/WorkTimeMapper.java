package com.hyron.atsdemo.mapper;

import com.hyron.atsdemo.pojo.WorkTime;

import java.util.List;

public interface WorkTimeMapper {
    List<WorkTime> setDataFromExcel(List list);
}
