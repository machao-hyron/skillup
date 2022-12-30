package com.longyue.orvetimeservice.service;

import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.JSONQuery;
import com.dtflys.forest.annotation.PostRequest;
import com.github.yulichang.base.MPJBaseService;
import com.longyue.orvetimeservice.config.PageUtils;
import com.longyue.orvetimeservice.domain.TEmployeeInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface TEmployeeInfoService extends MPJBaseService<TEmployeeInfo> {
    PageUtils queryPage(Map<String, Object> params);

    List<TEmployeeInfo> getTEmployeeInfoList();



    void exeortExcel(Map<String, Object> params, HttpServletResponse response) throws IOException;

    String sendEmail(Map<String,Object> params);


}
