package com.example.portfolioJuanMGodoy.Interface;

import java.util.List;

import com.example.portfolioJuanMGodoy.Entity.Proyectos;

public interface ProyectosInterfaz {
	
	public List<Proyectos> getProyectos();
	
	public void saveProyectos(Proyectos proyectos);

	public void deleteProyectos(String id);
	
	public Proyectos findProyectos(String id);

}
