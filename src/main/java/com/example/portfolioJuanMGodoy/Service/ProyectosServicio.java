package com.example.portfolioJuanMGodoy.Service;

import com.example.portfolioJuanMGodoy.Entity.Proyectos;
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
	public List<Proyectos> getProyectos() { 
		List<Proyectos> proyectos = proyectosRepositorio.findAll(); 
		return proyectos; 
	}

	@Override 
	public void saveProyectos(Proyectos proyectos) {
		proyectosRepositorio.save(proyectos);
	 }

	@Override
	public void deleteProyectos(String id) {
		proyectosRepositorio.deleteById(id);
	}

	@Override
	public Proyectos findProyectos(String id) {
		Proyectos proyectos = proyectosRepositorio.findById(id).orElse(null);
		return proyectos;
	}
}

    

