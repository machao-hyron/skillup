package com.hyron.ats.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hyron.ats.pojo.TAccountInfo;
import com.hyron.ats.service.LoginService;

@Controller
public class EmployeeSearch {

	@Autowired
	private LoginService loginService;

    @GetMapping(value = "employeeSearch")
    public String init(Model model) {
        List<TAccountInfo> tAccountInfo = loginService.selectAll();
        model.addAttribute("tAccountInfo",tAccountInfo);
        return "employeeSearch";
    }
}
