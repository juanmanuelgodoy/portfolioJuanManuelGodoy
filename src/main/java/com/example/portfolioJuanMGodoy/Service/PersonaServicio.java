package com.example.portfolioJuanMGodoy.Service;

import com.example.portfolioJuanMGodoy.Entity.PersonaEntidad;
import com.example.portfolioJuanMGodoy.Interface.PersonaInterfaz;
import com.example.portfolioJuanMGodoy.Repository.PersonaRepositorio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicio implements PersonaInterfaz {

	
	@Autowired
	PersonaRepositorio personaRepositorio;

	
	 @Override public List<PersonaEntidad> getPersona() { List<PersonaEntidad> persona =
			personaRepositorio.findAll(); return persona; }
	 
	 @Override public void guardarPersona(PersonaEntidad persona) {
		 	personaRepositorio.save(persona);
	 }

	@Override
	public void eliminarPersona(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersonaEntidad buscarPersona(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
		/*
		 * @Override public void eliminarPersona(String id) {
		 * personaRepositorio.deleteById(id); }
		 * 
		 * @Override public PersonaEntidad buscarPersona(String id) { PersonaEntidad
		 * persona = personaRepositorio.findById(id).orElse(null); return persona; }
		 */
		 

}
