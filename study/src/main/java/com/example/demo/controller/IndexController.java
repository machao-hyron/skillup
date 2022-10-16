package com.example.demo.controller;

import com.example.demo.constant.StringConstant;
import com.example.demo.entity.TUserInfo;
import com.example.demo.model.IndexFormModel;
import com.example.demo.service.IndexService;
import com.example.demo.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping(value = {"/","/toindex"})
    public String ToIndex(HttpSession session, Model model){

        IndexFormModel indexFormModel = new IndexFormModel();
        //获取当前登录的用户姓名
        TUserInfo userInfo = (TUserInfo) session.getAttribute(StringConstant.SESSION_USERINFO);
        indexFormModel.setUsername(userInfo.getUserName());
        Result r = indexService.toIndex();
        Map map;
        map = r.getData();
        List<TUserInfo> userInfos = (List<TUserInfo>) map.get("userInfos");
        log.info("-------" + userInfos.toString());
        indexFormModel.setUserInfos(userInfos);
        model.addAttribute("indexFormModel",indexFormModel);
        return "index";
    }


}
