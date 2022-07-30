package com.example.portfolioJuanMGodoy.Interface;

import java.util.List;

import com.example.portfolioJuanMGodoy.Entity.ExpLaboral;


public interface ExpLaboralInterfaz {
	
	public List<ExpLaboral> getExpLaboral();
	
	public void saveExpLaboral(ExpLaboral expLaboral);

	public void deleteExpLaboral(String id);
	
	public ExpLaboral findExpLaboral(String id);
}


