package com.example.portfolioJuanMGodoy.Service;

import com.example.portfolioJuanMGodoy.Entity.Persona;
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
	public List<Persona> getPersona() { 
		List<Persona> persona = personaRepositorio.findAll(); 
		return persona; 
	}

	@Override 
	public void savePersona(Persona persona) {
		personaRepositorio.save(persona);
	 }

	@Override
	public void deletePersona(String id) {
		personaRepositorio.deleteById(id);
	}

	@Override
	public Persona findPersona(String id) {
		Persona persona = personaRepositorio.findById(id).orElse(null);
		return persona;
	}

}
