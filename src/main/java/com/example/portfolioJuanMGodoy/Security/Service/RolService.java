package com.example.portfolioJuanMGodoy.Security.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.portfolioJuanMGodoy.Security.Entity.Rol;
import com.example.portfolioJuanMGodoy.Security.Enums.RolNombre;
import com.example.portfolioJuanMGodoy.Security.Repository.iRolRepository;

@Service
@Transactional
public class RolService {

	@Autowired
	iRolRepository irolRepository;
	
	public Optional<Rol> getByRolNombre(RolNombre rolNombre){
		return irolRepository.findByRolNombre(rolNombre);
	}
	
	public void save(Rol rol) {
		irolRepository.save(rol);
	}
}
