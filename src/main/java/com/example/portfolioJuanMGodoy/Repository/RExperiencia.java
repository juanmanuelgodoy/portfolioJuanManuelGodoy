package com.example.portfolioJuanMGodoy.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.portfolioJuanMGodoy.Entity.Experiencia;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, String> {
	
	public Optional<Experiencia> findByNombreE(String nombreE);
		
	public boolean existsByNombreE(String nombreE);

}
