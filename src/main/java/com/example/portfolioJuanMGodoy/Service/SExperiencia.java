package com.example.portfolioJuanMGodoy.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.portfolioJuanMGodoy.Entity.Experiencia;
import com.example.portfolioJuanMGodoy.Repository.RExperiencia;

@Service
@Transactional
public class SExperiencia {
	
	@Autowired
	RExperiencia rExperiencia;
	
	public List<Experiencia> list(){
		return rExperiencia.findAll();
	}
	
	public Optional<Experiencia> getOne(String id){
		return rExperiencia.findById(id);
	}
	
	public Optional<Experiencia> getByNombreE(String nombreE){
		return rExperiencia.findByNombreE(nombreE);
	}

	public void save(Experiencia expe) {
		rExperiencia.save(expe);
	}
	
	public void delete(String id) {
		rExperiencia.deleteById(id);
	}
	
	public boolean existsById(String id) {
		return rExperiencia.existsById(id);
	}
	
	public boolean existsByNombreE(String nombreE) {
		return rExperiencia.existsByNombreE(nombreE);
	}
	
}
