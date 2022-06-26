package com.example.portfolioJuanMGodoy.Interface;

import com.example.portfolioJuanMGodoy.Entity.PersonaEntidad;
import java.util.List;

public interface PersonaInterfaz {
	
	public List<PersonaEntidad> getPersona();
	
	public void guardarPersona(PersonaEntidad persona);

	public void eliminarPersona(String id);
	
	public PersonaEntidad buscarPersona(String id);
}
