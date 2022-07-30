package com.example.portfolioJuanMGodoy.Service;

import com.example.portfolioJuanMGodoy.Entity.Educacion;
import com.example.portfolioJuanMGodoy.Interface.EducacionInterfaz;
import com.example.portfolioJuanMGodoy.Repository.EducacionRepositorio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServicio implements EducacionInterfaz{
	
    @Autowired
    EducacionRepositorio educacionRepositorio;
   
	@Override 
	public List<Educacion> getEducacion() { 
		List<Educacion> educacion = educacionRepositorio.findAll(); 
		return educacion; 
	}

	@Override 
	public void saveEducacion(Educacion educacion) {
		educacionRepositorio.save(educacion);
	 }

	@Override
	public void deleteEducacion(String id) {
		educacionRepositorio.deleteById(id);
	}

	@Override
	public Educacion findEducacion(String id) {
		Educacion educacion = educacionRepositorio.findById(id).orElse(null);
		return educacion;
	}

}

