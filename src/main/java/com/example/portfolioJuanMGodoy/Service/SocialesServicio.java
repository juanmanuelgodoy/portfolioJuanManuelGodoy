package com.example.portfolioJuanMGodoy.Service;

import com.example.portfolioJuanMGodoy.Entity.Sociales;
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
	public List<Sociales> getSociales() { 
		List<Sociales> sociales = socialesRepositorio.findAll(); 
		return sociales; 
	}

	@Override 
	public void saveSociales(Sociales sociales) {
		socialesRepositorio.save(sociales);
	 }

	@Override
	public void deleteSociales(String id) {
		socialesRepositorio.deleteById(id);
	}

	@Override
	public Sociales findSociales(String id) {
		Sociales sociales = socialesRepositorio.findById(id).orElse(null);
		return sociales;
	}
   
}

    

