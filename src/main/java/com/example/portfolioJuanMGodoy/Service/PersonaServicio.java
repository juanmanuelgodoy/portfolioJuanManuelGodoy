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

	@Override 
	public List<PersonaEntidad> getPersona() { 
		List<PersonaEntidad> persona = personaRepositorio.findAll(); 
		return persona; 
	}

	@Override 
	public void savePersona(PersonaEntidad persona) {
		personaRepositorio.save(persona);
	 }

	@Override
	public void deletePersona(String id) {
		personaRepositorio.deleteById(id);
	}

	@Override
	public PersonaEntidad findPersona(String id) {
		PersonaEntidad persona = personaRepositorio.findById(id).orElse(null);
		return persona;
	}

}
