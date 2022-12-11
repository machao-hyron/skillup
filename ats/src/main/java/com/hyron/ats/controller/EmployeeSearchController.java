package com.hyron.ats.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyron.ats.dto.EmployeeSearchInDto;
import com.hyron.ats.dto.EmployeeSearchOutDto;
import com.hyron.ats.serviceImpl.EmployeeSearchServiceImpl;

@Controller
public class EmployeeSearchController {

	@Autowired
	private EmployeeSearchServiceImpl employeeSearchServiceImpl;

    @GetMapping(value = "employeeSearch")
    public String init() {
        return "employeeSearch";
    }
    
	/**
	 * パラメータを取得する
	 * @return
	 * @throws Exception
	 */
    @PostMapping(value = "employeeSearch")
	public String dateAll(EmployeeSearchInDto inDto,final Model model) throws Exception{

    	if (StringUtils.isNotEmpty(inDto.getDepartmentId())
    			|| StringUtils.isNotEmpty(inDto.getEmployeeId())
    			|| StringUtils.isNotEmpty(inDto.getEmployeeName())
    			|| StringUtils.isNotEmpty(inDto.getSkill())) {
    		List<EmployeeSearchOutDto> employeeSearchOutDto = employeeSearchServiceImpl.getEmployeeSearchInfo(inDto);
    		model.addAttribute("employeeSearchOutDto",employeeSearchOutDto);
    		return "redirect:employeeSearch";
		} else {
			model.addAttribute("errorMsg", "没有检索到该对象的数据。");
			return "employeeSearch";
		}
	}
}
