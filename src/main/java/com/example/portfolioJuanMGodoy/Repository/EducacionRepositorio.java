package com.example.portfolioJuanMGodoy.Repository;

import com.example.portfolioJuanMGodoy.Entity.EducacionEntidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepositorio extends CrudRepository<EducacionEntidad, Integer> {

}
