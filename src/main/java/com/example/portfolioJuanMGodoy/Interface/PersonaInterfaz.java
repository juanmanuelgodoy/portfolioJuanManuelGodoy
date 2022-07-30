package com.example.portfolioJuanMGodoy.Interface;

import com.example.portfolioJuanMGodoy.Entity.Persona;
import java.util.List;

public interface PersonaInterfaz {
	
	public List<Persona> getPersona();
	
	public void savePersona(Persona persona);

	public void deletePersona(String id);
	
	public Persona findPersona(String id);
}
