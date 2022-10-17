package com.example.demo.controller;

import com.example.demo.dto.MainDto;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.rmi.runtime.NewThreadAction;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "main")
    public String Mainbtn(MainDto dto, final Model model) {
        List<MainDto> dtoList = new ArrayList<MainDto>();
        dtoList=mainService.mainSearch();
        // TODO
        model.addAttribute("DTO",dtoList);

        return "main";
    }
}
