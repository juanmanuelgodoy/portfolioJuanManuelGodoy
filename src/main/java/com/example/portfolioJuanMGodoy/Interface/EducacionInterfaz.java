package com.example.portfolioJuanMGodoy.Interface;

import java.util.List;

import com.example.portfolioJuanMGodoy.Entity.Educacion;

public interface EducacionInterfaz {
	
	public List<Educacion> getEducacion();
	
	public void saveEducacion(Educacion educacion);

	public void deleteEducacion(String id);
	
	public Educacion findEducacion(String id);
}


