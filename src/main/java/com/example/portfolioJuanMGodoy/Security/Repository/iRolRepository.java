package com.example.portfolioJuanMGodoy.Security.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.portfolioJuanMGodoy.Security.Entity.Rol;
import com.example.portfolioJuanMGodoy.Security.Enums.RolNombre;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
	Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
