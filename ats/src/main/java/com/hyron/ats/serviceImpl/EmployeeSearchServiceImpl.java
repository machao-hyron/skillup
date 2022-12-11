package com.hyron.ats.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyron.ats.dto.EmployeeSearchInDto;
import com.hyron.ats.dto.EmployeeSearchOutDto;
import com.hyron.ats.mapper.TEmployeeInfoMapper;
import com.hyron.ats.mapper.TProjectInformationMapper;
import com.hyron.ats.pojo.EmployeeSearchInfo;

import com.hyron.ats.service.EmployeeSearchService;
/**
 * 
 * @author 西野ななせ
 * @date: 2022-12-6 22:48:52
 * @version 1.0
 */
@Service
public class EmployeeSearchServiceImpl implements EmployeeSearchService{

	@Autowired
	private TEmployeeInfoMapper tEmployeeInfoMapper;
	@Autowired
	private TProjectInformationMapper tProjectInformationMapper;
	
	@Override
	public List<EmployeeSearchOutDto> getEmployeeSearchInfoList(EmployeeSearchInDto inDto) {
		List<EmployeeSearchOutDto> outDtoList = new ArrayList<>();
		List<EmployeeSearchInfo> EmployeeSearchInfoList = tEmployeeInfoMapper.selectjoin(inDto);
		List<String> skillList = getSkill(EmployeeSearchInfoList);
		if (EmployeeSearchInfoList.size() != 0) {
			for (int i = 0; i < EmployeeSearchInfoList.size(); i++) {
				EmployeeSearchOutDto outDto = new EmployeeSearchOutDto();
				outDto.setDepartmentId(EmployeeSearchInfoList.get(i).getDepartmentId());
				outDto.setEmployeeName(EmployeeSearchInfoList.get(i).getEmployeeName());
				outDto.setEmployeeId(EmployeeSearchInfoList.get(i).getEmployeeId());
				outDto.setProjectName(EmployeeSearchInfoList.get(i).getProjectName());
				outDto.setRojectLeaderId(EmployeeSearchInfoList.get(i).getProjectLeaderId());
				outDto.setSkill(skillList.get(i));
				outDtoList.add(outDto);
			}
			return outDtoList;
		} else {
			return outDtoList;
		}
		
	}

	@Override
	public List<String> getSkill(List<EmployeeSearchInfo> EmployeeSearchInfoList) {
		List<String> skillList = new ArrayList<>();
		StringBuffer str = new StringBuffer() ;
		for (int i = 0; i < EmployeeSearchInfoList.size(); i++) {
			byte[] StrSkill = getStrSkill(EmployeeSearchInfoList.get(i));
			for (int j = 0; j < StrSkill.length; j++) {
				if (EmployeeSearchInfoList != null && StrSkill[j] == 1) {
					str.append(SkillName[j]);
					str.append(",");
				}else {
					continue;
				}
			}
			String str1 = str.toString().substring(0,str.length()-1);
			skillList.add(str1);	
		}
		return skillList;
	}


	/**
	 * 技能信息取得
	 * @param tSkillInfo
	 * @return
	 */
	public byte[] getStrSkill(EmployeeSearchInfo employeeSearchInfo) {
		byte[] skill = new byte[18];
		skill[0] = employeeSearchInfo.getAndroid();
		skill[1] = employeeSearchInfo.getAngular();
		skill[2] = employeeSearchInfo.getCPlus();
		skill[3] = employeeSearchInfo.getCSharp();
		skill[4] = employeeSearchInfo.getCss();
		skill[5] = employeeSearchInfo.getHtml();
		skill[6] = employeeSearchInfo.getIos();
		skill[7] = employeeSearchInfo.getJava();
		skill[8] = employeeSearchInfo.getJquery();
		skill[9] = employeeSearchInfo.getJsp();
		skill[10] = employeeSearchInfo.getMysql();
		skill[11] = employeeSearchInfo.getNet();
		skill[12] = employeeSearchInfo.getOracle();
		skill[13] = employeeSearchInfo.getReact();
		skill[14] = employeeSearchInfo.getSpring();
		skill[15] = employeeSearchInfo.getSqlserver();
		skill[16] = employeeSearchInfo.getThymeleaf();
		skill[17] = employeeSearchInfo.getVue();
		return skill;
	}
	
	/**
	 * 技能名数组
	 */
	final static String SkillName[] = new String[]{
		"android",
		"angular",
		"c_plus",
		"c_sharp",
		"css",
		"html",
		"ios",
		"java",
		"jquery",
		"jsp",
		"mysql",
		"net",
		"oracle",
		"react",
		"spring",
		"sqlserver",
		"thymeleaf",
		"vue"
	};
}
