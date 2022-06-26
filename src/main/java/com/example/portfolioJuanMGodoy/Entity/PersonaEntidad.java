package com.example.portfolioJuanMGodoy.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonaEntidad {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nombre;
	private String apellido;
	private String foto;
	
	public PersonaEntidad(Long id, String nombre, String apellido, String foto) {
	
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.foto = foto;
	}

	public PersonaEntidad() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long  id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	
}