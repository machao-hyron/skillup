package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.TUserInfo;
import com.example.demo.service.TuserInfoService;

@Controller
public class SearchController {
	
	@Autowired
	private TuserInfoService tuserInfoService;
	
	@RequestMapping("/search")
	public String search(Model model){
		List<TUserInfo> selectByExample = tuserInfoService.findAll();
		model.addAttribute("userList",selectByExample);
		return "user";
	}

	@RequestMapping("/modify")
	public String modify(Integer userId,Model model){
		TUserInfo tUserInfo = tuserInfoService.selectByPrimaryKey(userId);
		model.addAttribute("modify",tUserInfo==null ?new TUserInfo() :tUserInfo);
		return "modify";
	}

	@RequestMapping("/update")
	public String update(TUserInfo tUserInfo){
		if(tUserInfo.getUserId() == null){
			tuserInfoService.insert(tUserInfo);
		}else{
			tuserInfoService.updateByPrimaryKeySelective(tUserInfo);
		}
		return "redirect:search";
	}

	@RequestMapping("/delete")
	public String delete(Integer userId){
		tuserInfoService.deleteByPrimaryKey(userId);
		return "redirect:search";
	}
}