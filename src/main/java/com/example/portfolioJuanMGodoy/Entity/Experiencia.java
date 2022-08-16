package com.example.portfolioJuanMGodoy.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Experiencia {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	private String nombreE;
	private String descripcionE;
	
	public Experiencia() {	
	}

	public Experiencia(String nombreE, String descripcionE) {
		this.nombreE = nombreE;
		this.descripcionE = descripcionE;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombreE() {
		return nombreE;
	}

	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}

	public String getDescripcionE() {
		return descripcionE;
	}

	public void setDescripcionE(String descripcionE) {
		this.descripcionE = descripcionE;
	}

	@Override
	public String toString() {
		return "Experiencia [id=" + id + ", nombreE=" + nombreE + ", descripcionE=" + descripcionE + "]";
	}
}
