package com.hyron.ats.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyron.ats.dto.EmployeeSearchInDto;
import com.hyron.ats.dto.EmployeeSearchOutDto;
import com.hyron.ats.mapper.TEmployeeInfoMapper;
import com.hyron.ats.mapper.TProjectInformationMapper;
import com.hyron.ats.mapper.TSkillInfoMapper;
import com.hyron.ats.pojo.TEmployeeInfo;
import com.hyron.ats.pojo.TProjectInformation;
import com.hyron.ats.pojo.TSkillInfo;
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
	private TSkillInfoMapper tSkillInfoMapper;
	@Autowired
	private TEmployeeInfoMapper tEmployeeInfoMapper;
	@Autowired
	private TProjectInformationMapper tProjectInformationMapper;

	@Override
	public List<EmployeeSearchOutDto> getEmployeeSearchInfo(EmployeeSearchInDto inDto) {
		List<EmployeeSearchOutDto> outDtoList = new ArrayList<>();
		List<TEmployeeInfo> tEmployeeInfoList = tEmployeeInfoMapper.selectAll(inDto);
		List<TProjectInformation> tProjectInformationList = new ArrayList<>();
		List<String> skillList = getSkill(inDto);
		if (tEmployeeInfoList.size() != 0) {
			for (int i = 0; i < tEmployeeInfoList.size(); i++) {
				EmployeeSearchOutDto outDto = new EmployeeSearchOutDto();
				tProjectInformationList = tProjectInformationMapper.selectAll(tEmployeeInfoList.get(i).getDepartmentId());
				outDto.setDepartmentId(tEmployeeInfoList.get(i).getDepartmentId());
				outDto.setEmployeeName(tEmployeeInfoList.get(i).getEmployeeName());
				outDto.setEmployeeId(tEmployeeInfoList.get(i).getEmployeeId());
				outDto.setProjectId(tEmployeeInfoList.get(i).getProjectId());
				outDto.setProjectName(tProjectInformationList.get(i).getProjectName());
				outDto.setRojectLeaderId(tProjectInformationList.get(i).getProjectLeaderId());
				outDto.setSkill(skillList.get(i));
				outDtoList.add(outDto);
			}
			return outDtoList;
		} else {
			return outDtoList;
		}
	}

	@Override
	public List<String> getSkill(EmployeeSearchInDto inDto) {
		List<TSkillInfo> tSkillInfo = tSkillInfoMapper.selectAll(inDto);
		List<String> skillList = new ArrayList<>();
		StringBuffer str = new StringBuffer() ;
		for (int i = 0; i < tSkillInfo.size(); i++) {
			byte[] StrSkill = getStrSkill(tSkillInfo.get(i));
			for (int j = 0; j < StrSkill.length; j++) {
				if (tSkillInfo != null && StrSkill[j] == 1) {
					str.append(SkillName[j]);
				}else {
					continue;
				}
				str.append(",");
			}
			skillList.add(str.toString());
		}
		return skillList;
	}


	/**
	 * 技能信息取得
	 * @param tSkillInfo
	 * @return
	 */
	public byte[] getStrSkill(TSkillInfo tSkillInfo) {
		byte[] skill = new byte[18];
		skill[0] = tSkillInfo.getAndroid();
		skill[1] = tSkillInfo.getAngular();
		skill[2] = tSkillInfo.getCPlus();
		skill[3] = tSkillInfo.getCSharp();
		skill[4] = tSkillInfo.getCss();
		skill[5] = tSkillInfo.getHtml();
		skill[6] = tSkillInfo.getIos();
		skill[7] = tSkillInfo.getJava();
		skill[8] = tSkillInfo.getJquery();
		skill[9] = tSkillInfo.getJsp();
		skill[10] = tSkillInfo.getMysql();
		skill[11] = tSkillInfo.getNet();
		skill[12] = tSkillInfo.getOracle();
		skill[13] = tSkillInfo.getReact();
		skill[14] = tSkillInfo.getSpring();
		skill[15] = tSkillInfo.getSqlserver();
		skill[16] = tSkillInfo.getThymeleaf();
		skill[17] = tSkillInfo.getVue();
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
