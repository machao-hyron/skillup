package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.TUserInfo;
import com.example.demo.entity.TUserInfoExample;
import com.example.demo.mapper.TUserInfoMapper;

@Controller
public class SearchController {
	
	@Autowired
	private TUserInfoMapper tUserInfoMapper;
	
	@RequestMapping("/search")
	public String search(Model model){
		TUserInfoExample example = new TUserInfoExample();
		List<TUserInfo> userList = tUserInfoMapper.selectByExample(example);
		model.addAttribute("userList",userList);
		return "user";
	}

	@RequestMapping("/modify")
	public String modify(Integer userId,Model model){
		TUserInfo tUserInfo = tUserInfoMapper.selectByPrimaryKey(userId);
		model.addAttribute("modify",tUserInfo==null ?new TUserInfo() :tUserInfo);
		return "modify";
	}

	@RequestMapping("/update")
	public String update(TUserInfo tUserInfo){
		if(tUserInfo.getUserId() == null){
			tUserInfoMapper.insert(tUserInfo);
		}else{
			tUserInfoMapper.updateByPrimaryKeySelective(tUserInfo);
		}
		return "redirect:search";
	}

	@RequestMapping("/delete")
	public String delete(Integer userId){
		tUserInfoMapper.deleteByPrimaryKey(userId);
		return "redirect:search";
	}
}