package com.hyron.ats.service;

import java.util.List;

import com.hyron.ats.dto.LoginDto;
import com.hyron.ats.pojo.TAccountInfo;

public interface LoginService {


	boolean loginAcntCheck(LoginDto dto);
	
	List<TAccountInfo> selectAll();
}
