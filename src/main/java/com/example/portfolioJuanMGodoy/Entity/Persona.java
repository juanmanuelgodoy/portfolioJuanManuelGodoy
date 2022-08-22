package com.example.portfolioJuanMGodoy.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Persona {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String acerca;
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String img;

	public Persona(@NotNull @Size(min = 1, max = 50, message = "no cumple con la longitud") String nombre,
			@NotNull @Size(min = 1, max = 50, message = "no cumple con la longitud") String apellido,
			@Size(min = 1, max = 50, message = "no cumple con la longitud") String acerca,
			@Size(min = 1, max = 50, message = "no cumple con la longitud") String img) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.acerca = acerca;
		this.img = img;
	}

	public Persona() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getAcerca() {
		return acerca;
	}

	public void setAcerca(String acerca) {
		this.acerca = acerca;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", acerca=" + acerca + ", img="
				+ img + "]";
	}

}