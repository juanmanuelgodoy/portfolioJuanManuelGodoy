package com.example.portfolioJuanMGodoy.Service;

import com.example.portfolioJuanMGodoy.Entity.SocialesEntidad;
import com.example.portfolioJuanMGodoy.Interface.SocialesInterfaz;
import com.example.portfolioJuanMGodoy.Repository.SocialesRepositorio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialesServicio implements SocialesInterfaz{
	
    @Autowired
    SocialesRepositorio socialesRepositorio;

	@Override 
	public List<SocialesEntidad> getSociales() { 
		List<SocialesEntidad> sociales = socialesRepositorio.findAll(); 
		return sociales; 
	}

	@Override 
	public void saveSociales(SocialesEntidad sociales) {
		socialesRepositorio.save(sociales);
	 }

	@Override
	public void deleteSociales(String id) {
		socialesRepositorio.deleteById(id);
	}

	@Override
	public SocialesEntidad findSociales(String id) {
		SocialesEntidad sociales = socialesRepositorio.findById(id).orElse(null);
		return sociales;
	}
   
}

    

