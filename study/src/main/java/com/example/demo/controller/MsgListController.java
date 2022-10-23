package com.example.demo.controller;

import com.example.demo.entity.UserMsg;
import com.example.demo.service.MsgListService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class MsgListController {

    @Autowired
    private MsgListService msgListService;

    @RequestMapping(value = {"/","/list-init"})
    public String MsgListInit(HttpSession session, Model model){

        List<UserMsg> userMsgList = new ArrayList<>();
        //获取部门同事情报
        userMsgList = msgListService.selectAll();
        if(userMsgList!=null) {
            log.info("获取部门同事情报成功！");
            model.addAttribute("userMsgList",userMsgList);
        }

        return "list-init";
    }


}
