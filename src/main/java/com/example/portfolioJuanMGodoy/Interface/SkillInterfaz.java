package com.example.portfolioJuanMGodoy.Interface;

import java.util.List;

import com.example.portfolioJuanMGodoy.Entity.SkillEntidad;

public interface SkillInterfaz {
	
	public List<SkillEntidad> getSkill();
	
	public void saveSkill(SkillEntidad skill);

	public void deleteSkill(String id);
	
	public SkillEntidad findSkill(String id);

}
