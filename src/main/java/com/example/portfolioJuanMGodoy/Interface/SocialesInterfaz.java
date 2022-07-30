package com.example.portfolioJuanMGodoy.Interface;

import java.util.List;

import com.example.portfolioJuanMGodoy.Entity.Sociales;

public interface SocialesInterfaz {

	public List<Sociales> getSociales();
	
	public void saveSociales(Sociales Sociales);

	public void deleteSociales(String id);
	
	public Sociales findSociales(String id);

}
