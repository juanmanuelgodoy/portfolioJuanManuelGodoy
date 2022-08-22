package com.example.portfolioJuanMGodoy.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.portfolioJuanMGodoy.Entity.Persona;
import com.example.portfolioJuanMGodoy.Interface.IPersonaService;
import com.example.portfolioJuanMGodoy.Security.Repository.IPersonaRepository;

@Service
public class ImpPersonaService implements IPersonaService{
	
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(String id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(String id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}