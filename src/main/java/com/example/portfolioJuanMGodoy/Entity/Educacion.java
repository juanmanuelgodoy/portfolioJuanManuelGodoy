package com.example.portfolioJuanMGodoy.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Educacion {
    
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombreE;
    private String descripcionE;
    
	public Educacion(String nombreE, String descripcionE) {
		this.nombreE = nombreE;
		this.descripcionE = descripcionE;
	}

	public Educacion() {

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
		return "Educacion [id=" + id + ", nombreE=" + nombreE + ", descripcionE=" + descripcionE + "]";
	}

}