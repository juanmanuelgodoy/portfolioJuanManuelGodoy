package com.example.portfolioJuanMGodoy.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.portfolioJuanMGodoy.Entity.Educacion;
import com.example.portfolioJuanMGodoy.Repository.REducacion;

@Service
@Transactional
public class SEducacion {

	@Autowired
	REducacion rEducacion;
	
	public List<Educacion> list(){
		return rEducacion.findAll();
	}
	
	public Optional<Educacion> getOne(String id){
		return rEducacion.findById(id);
	}
	
	public Optional<Educacion> findByNombreE(String nombreE){
		return rEducacion.findByNombreE(nombreE);
	}
	
	public void save(Educacion educacion) {
		rEducacion.save(educacion);
	}
	
	public void delete(String id) {
		rEducacion.deleteById(id);
	}
	
	public boolean existsById(String id) {
		return rEducacion.existsById(id);
	}
	
	public boolean existsByNombreE(String nombreE) {
		return rEducacion.existsByNombreE(nombreE);
	}
}