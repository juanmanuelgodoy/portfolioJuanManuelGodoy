package com.example.portfolioJuanMGodoy.Repository;

import com.example.portfolioJuanMGodoy.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, String> {
    
//   public abstract PersonaEntidad findByUsername(String username);
    
}

//import com.example.portfolioJuanMGodoy.Entity.PersonaEntidad;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface PersonaRepositorio extends JpaRepository <PersonaEntidad, String> {
//
//}
