package com.example.portfolioJuanMGodoy.Repository;

import com.example.portfolioJuanMGodoy.Entity.Educacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepositorio extends JpaRepository<Educacion, String> {

}
