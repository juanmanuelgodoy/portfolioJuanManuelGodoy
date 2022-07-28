package com.example.portfolioJuanMGodoy.Service;

import com.example.portfolioJuanMGodoy.Entity.SkillEntidad;
import com.example.portfolioJuanMGodoy.Interface.SkillInterfaz;
import com.example.portfolioJuanMGodoy.Repository.SkillRepositorio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillServicio implements SkillInterfaz{
	
    @Autowired
    SkillRepositorio skillRepositorio;

	@Override 
	public List<SkillEntidad> getSkill() { 
		List<SkillEntidad> skill = skillRepositorio.findAll(); 
		return skill; 
	}

	@Override 
	public void saveSkill(SkillEntidad skill) {
		skillRepositorio.save(skill);
	 }

	@Override
	public void deleteSkill(String id) {
		skillRepositorio.deleteById(id);
	}

	@Override
	public SkillEntidad findSkill(String id) {
		SkillEntidad skill = skillRepositorio.findById(id).orElse(null);
		return skill;
	}
}

    

