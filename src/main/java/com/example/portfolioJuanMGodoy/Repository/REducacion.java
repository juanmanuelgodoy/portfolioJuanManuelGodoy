package com.example.portfolioJuanMGodoy.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.portfolioJuanMGodoy.Entity.Educacion;

@Repository
public interface REducacion extends JpaRepository<Educacion, String>{

	public Optional<Educacion> findByNombreE(String nombreE);
	
	public boolean existsByNombreE(String nombreE);
}
