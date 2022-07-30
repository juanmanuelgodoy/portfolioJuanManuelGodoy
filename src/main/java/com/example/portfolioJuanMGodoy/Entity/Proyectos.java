package com.example.portfolioJuanMGodoy.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Proyectos {
   
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String titulo;
    private String descripcion;
    private String url;
    private int persona;

    public Proyectos(String id, String titulo, String descripcion, String url, int persona) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.persona = persona;
    }

    public Proyectos() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "ProyectosEntidad{" + "id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", url=" + url + ", persona=" + persona + '}';
    }
    
    
}
