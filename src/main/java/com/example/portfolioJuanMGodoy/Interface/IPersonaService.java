package com.example.portfolioJuanMGodoy.Interface;

import java.util.List;

import com.example.portfolioJuanMGodoy.Entity.Persona;

public interface IPersonaService {
	
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(String id);
    
    public Persona findPersona(String id);
}
