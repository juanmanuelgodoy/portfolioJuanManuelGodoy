package com.example.portfolioJuanMGodoy.Interface;

import java.util.List;

import com.example.portfolioJuanMGodoy.Entity.HardAndSkills;

public interface HardAndSkillsInterfaz {
	
	public List<HardAndSkills> getSkill();
	
	public void saveSkill(HardAndSkills skill);

	public void deleteSkill(String id);
	
	public HardAndSkills findSkill(String id);

}
