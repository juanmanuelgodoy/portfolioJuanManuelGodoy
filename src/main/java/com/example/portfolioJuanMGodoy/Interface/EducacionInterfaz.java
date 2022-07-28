package com.example.portfolioJuanMGodoy.Interface;

import java.util.List;

import com.example.portfolioJuanMGodoy.Entity.EducacionEntidad;

public interface EducacionInterfaz {
	
	public List<EducacionEntidad> getEducacion();
	
	public void saveEducacion(EducacionEntidad educacion);

	public void deleteEducacion(String id);
	
	public EducacionEntidad findEducacion(String id);
}


