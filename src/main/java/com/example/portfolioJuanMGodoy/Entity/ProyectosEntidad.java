package com.example.portfolioJuanMGodoy.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProyectosEntidad {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long idProyectos;
    private String titulo;
    private String descripcion;
    private String url;
    private int persona;

    public ProyectosEntidad(Long idProyectos, String titulo, String descripcion, String url, int persona) {
        this.idProyectos = idProyectos;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.persona = persona;
    }

    public ProyectosEntidad() {
    }

    public Long getIdProyectos() {
        return idProyectos;
    }

    public void setIdProyectos(Long idProyectos) {
        this.idProyectos = idProyectos;
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
        return "ProyectosEntidad{" + "idProyectos=" + idProyectos + ", titulo=" + titulo + ", descripcion=" + descripcion + ", url=" + url + ", persona=" + persona + '}';
    }
    
    
}
