package com.example.portfolioJuanMGodoy.Repository;

import com.example.portfolioJuanMGodoy.Entity.ExpLaboralEntidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpLaboralRepositorio extends CrudRepository<ExpLaboralEntidad, Integer> {

    //public Optional<ExpLaboralEntidad> findById(int id);

    //public void deleteById(int id);
    
}
