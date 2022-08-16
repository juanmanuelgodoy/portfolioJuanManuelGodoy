package com.example.portfolioJuanMGodoy.DTO;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
	
	@NotBlank
	private String nombreE;
	@NotBlank
	private String descripcionE;
	
	public dtoExperiencia() {

	}

	public dtoExperiencia(@NotBlank String nombreE, @NotBlank String descripcionE) {
		this.nombreE = nombreE;
		this.descripcionE = descripcionE;
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
		return "dtoExperiencia [nombreE=" + nombreE + ", descripcionE=" + descripcionE + "]";
	}

}
