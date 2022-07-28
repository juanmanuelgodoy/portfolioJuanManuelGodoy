package com.example.portfolioJuanMGodoy.Service;

import com.example.portfolioJuanMGodoy.Entity.EducacionEntidad;
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
	public List<EducacionEntidad> getEducacion() { 
		List<EducacionEntidad> educacion = educacionRepositorio.findAll(); 
		return educacion; 
	}

	@Override 
	public void saveEducacion(EducacionEntidad educacion) {
		educacionRepositorio.save(educacion);
	 }

	@Override
	public void deleteEducacion(String id) {
		educacionRepositorio.deleteById(id);
	}

	@Override
	public EducacionEntidad findEducacion(String id) {
		EducacionEntidad educacion = educacionRepositorio.findById(id).orElse(null);
		return educacion;
	}

}

