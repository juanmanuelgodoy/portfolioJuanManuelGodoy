package com.example.portfolioJuanMGodoy.Interface;

import java.util.List;

import com.example.portfolioJuanMGodoy.Entity.ProyectosEntidad;

public interface ProyectosInterfaz {
	
	public List<ProyectosEntidad> getProyectos();
	
	public void saveProyectos(ProyectosEntidad proyectos);

	public void deleteProyectos(String id);
	
	public ProyectosEntidad findProyectos(String id);

}
