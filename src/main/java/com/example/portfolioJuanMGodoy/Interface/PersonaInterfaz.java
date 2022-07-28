package com.example.portfolioJuanMGodoy.Interface;

import com.example.portfolioJuanMGodoy.Entity.PersonaEntidad;
import java.util.List;

public interface PersonaInterfaz {
	
	public List<PersonaEntidad> getPersona();
	
	public void savePersona(PersonaEntidad persona);

	public void deletePersona(String id);
	
	public PersonaEntidad findPersona(String id);
}
