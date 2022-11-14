package com.hyron.atsdemo.service;

import com.hyron.atsdemo.pojo.WorkTime;

import java.util.List;

public interface WorkTimeService {
    List<WorkTime> setDataFromExcel(List list);
}
