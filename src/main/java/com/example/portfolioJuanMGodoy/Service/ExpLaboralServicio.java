package com.example.portfolioJuanMGodoy.Service;


import com.example.portfolioJuanMGodoy.Entity.ExpLaboral;
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
	public List<ExpLaboral> getExpLaboral() { 
		List<ExpLaboral> expLaboral = expLaboralRepositorio.findAll(); 
		return expLaboral; 
	}

	@Override 
	public void saveExpLaboral(ExpLaboral expLaboral) {
		expLaboralRepositorio.save(expLaboral);
	 }

	@Override
	public void deleteExpLaboral(String id) {
		expLaboralRepositorio.deleteById(id);
	}

	@Override
	public ExpLaboral findExpLaboral(String id) {
		ExpLaboral expLaboral = expLaboralRepositorio.findById(id).orElse(null);
		return expLaboral;
	}
}
