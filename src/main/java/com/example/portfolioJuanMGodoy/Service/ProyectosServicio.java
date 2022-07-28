package com.example.portfolioJuanMGodoy.Service;

import com.example.portfolioJuanMGodoy.Entity.ProyectosEntidad;
import com.example.portfolioJuanMGodoy.Interface.ProyectosInterfaz;
import com.example.portfolioJuanMGodoy.Repository.ProyectosRepositorio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosServicio implements ProyectosInterfaz{
	
    @Autowired
    ProyectosRepositorio proyectosRepositorio;

	@Override 
	public List<ProyectosEntidad> getProyectos() { 
		List<ProyectosEntidad> proyectos = proyectosRepositorio.findAll(); 
		return proyectos; 
	}

	@Override 
	public void saveProyectos(ProyectosEntidad proyectos) {
		proyectosRepositorio.save(proyectos);
	 }

	@Override
	public void deleteProyectos(String id) {
		proyectosRepositorio.deleteById(id);
	}

	@Override
	public ProyectosEntidad findProyectos(String id) {
		ProyectosEntidad proyectos = proyectosRepositorio.findById(id).orElse(null);
		return proyectos;
	}
}

    

