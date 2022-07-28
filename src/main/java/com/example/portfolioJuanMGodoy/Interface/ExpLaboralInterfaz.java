package com.example.portfolioJuanMGodoy.Interface;

import java.util.List;

import com.example.portfolioJuanMGodoy.Entity.ExpLaboralEntidad;


public interface ExpLaboralInterfaz {
	
	public List<ExpLaboralEntidad> getExpLaboral();
	
	public void saveExpLaboral(ExpLaboralEntidad expLaboral);

	public void deleteExpLaboral(String id);
	
	public ExpLaboralEntidad findExpLaboral(String id);
}


