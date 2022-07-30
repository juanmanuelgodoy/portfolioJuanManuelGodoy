package com.example.portfolioJuanMGodoy.Service;

import com.example.portfolioJuanMGodoy.Entity.HardAndSkills;
import com.example.portfolioJuanMGodoy.Interface.HardAndSkillsInterfaz;
import com.example.portfolioJuanMGodoy.Repository.HardAndSkillsRepositorio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardAndSkillsServicio implements HardAndSkillsInterfaz{
	
    @Autowired
    HardAndSkillsRepositorio skillRepositorio;

	@Override 
	public List<HardAndSkills> getSkill() { 
		List<HardAndSkills> skill = skillRepositorio.findAll(); 
		return skill; 
	}

	@Override 
	public void saveSkill(HardAndSkills skill) {
		skillRepositorio.save(skill);
	 }

	@Override
	public void deleteSkill(String id) {
		skillRepositorio.deleteById(id);
	}

	@Override
	public HardAndSkills findSkill(String id) {
		HardAndSkills skill = skillRepositorio.findById(id).orElse(null);
		return skill;
	}
}

    

