package com.example.portfolioJuanMGodoy.Security.Entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.portfolioJuanMGodoy.Security.Enums.RolNombre;

@Entity
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Enumerated(EnumType.STRING)
	private RolNombre rolNombre;
	
	public Rol() {
		
	}

	public Rol(int id, RolNombre rolNombre) {
		this.id = id;
		this.rolNombre = rolNombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RolNombre getRolNombre() {
		return rolNombre;
	}

	public void setRolNombre(RolNombre rolNombre) {
		this.rolNombre = rolNombre;
	}

	@Override
	public String toString() {
		return "Rol [id=" + id + ", rolNombre=" + rolNombre + "]";
	}

	
}
