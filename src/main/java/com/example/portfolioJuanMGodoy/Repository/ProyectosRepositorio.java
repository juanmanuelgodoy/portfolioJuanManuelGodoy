package com.example.portfolioJuanMGodoy.Repository;

import com.example.portfolioJuanMGodoy.Entity.ProyectosEntidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepositorio extends CrudRepository<ProyectosEntidad, Integer> {
    
    
}