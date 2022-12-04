package com.hyron.ats.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyron.ats.dto.LoginDto;
import com.hyron.ats.mapper.TAccountInfoMapper;
import com.hyron.ats.pojo.TAccountInfo;
import com.hyron.ats.service.LoginService;



@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private TAccountInfoMapper accountInfoMapper;

	@Override
	public boolean loginAcntCheck(LoginDto dto) {
		
		TAccountInfo accountInfo = accountInfoMapper.selectById(dto.getId());
		if (accountInfo!= null) {
			if(accountInfo.getEmployeeId().equals(dto.getId()) && accountInfo.getPsw().equals(dto.getPwd())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<TAccountInfo> selectAll() {
		List<TAccountInfo> accountInfoList = accountInfoMapper.selectAll();
		// TODO Auto-generated method stub
		return accountInfoList;
	}
}
