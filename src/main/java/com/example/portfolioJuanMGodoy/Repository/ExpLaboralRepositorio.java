package com.example.portfolioJuanMGodoy.Repository;

import com.example.portfolioJuanMGodoy.Entity.ExpLaboralEntidad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpLaboralRepositorio extends JpaRepository<ExpLaboralEntidad, String> {

    //public Optional<ExpLaboralEntidad> findById(String id);

    //public void deleteById(String id);
    
}
