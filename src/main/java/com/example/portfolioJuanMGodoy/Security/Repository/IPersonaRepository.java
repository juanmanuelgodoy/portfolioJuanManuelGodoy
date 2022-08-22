package com.example.portfolioJuanMGodoy.Security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.portfolioJuanMGodoy.Entity.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,String> {
    
}
