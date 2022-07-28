package com.example.portfolioJuanMGodoy.Interface;

import java.util.List;

import com.example.portfolioJuanMGodoy.Entity.SocialesEntidad;

public interface SocialesInterfaz {

	public List<SocialesEntidad> getSociales();
	
	public void saveSociales(SocialesEntidad Sociales);

	public void deleteSociales(String id);
	
	public SocialesEntidad findSociales(String id);

}
