package com.example.portfolioJuanMGodoy.Service;


import com.example.portfolioJuanMGodoy.Entity.ExpLaboralEntidad;
import com.example.portfolioJuanMGodoy.Interface.ExpLaboralInterfaz;
import com.example.portfolioJuanMGodoy.Repository.ExpLaboralRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpLaboralServicio implements ExpLaboralInterfaz{
    
    @Autowired
    ExpLaboralRepositorio expLaboralRepositorio;
    
	@Override 
	public List<ExpLaboralEntidad> getExpLaboral() { 
		List<ExpLaboralEntidad> expLaboral = expLaboralRepositorio.findAll(); 
		return expLaboral; 
	}

	@Override 
	public void saveExpLaboral(ExpLaboralEntidad expLaboral) {
		expLaboralRepositorio.save(expLaboral);
	 }

	@Override
	public void deleteExpLaboral(String id) {
		expLaboralRepositorio.deleteById(id);
	}

	@Override
	public ExpLaboralEntidad findExpLaboral(String id) {
		ExpLaboralEntidad expLaboral = expLaboralRepositorio.findById(id).orElse(null);
		return expLaboral;
	}
}
