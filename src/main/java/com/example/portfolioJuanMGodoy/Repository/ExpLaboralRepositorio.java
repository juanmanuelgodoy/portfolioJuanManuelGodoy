package com.example.portfolioJuanMGodoy.Repository;

import com.example.portfolioJuanMGodoy.Entity.ExpLaboral;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpLaboralRepositorio extends JpaRepository<ExpLaboral, String> {

    //public Optional<ExpLaboralEntidad> findById(String id);

    //public void deleteById(String id);
    
}
