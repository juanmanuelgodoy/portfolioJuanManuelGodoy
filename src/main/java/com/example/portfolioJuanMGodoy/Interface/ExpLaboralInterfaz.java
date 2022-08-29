package com.example.portfolioJuanMGodoy.Interface;

import java.util.List;

import com.example.portfolioJuanMGodoy.Entity.Experiencia;


public interface ExpLaboralInterfaz {
	
	public List<Experiencia> getExpLaboral();
	
	public void saveExperiencia(Experiencia experiencia);

	public void deleteExperiencia(String id);
	
	public Experiencia findExperiencia(String id);
}


