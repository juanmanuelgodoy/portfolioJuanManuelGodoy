package com.example.portfolioJuanMGodoy.Entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EducacionEntidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long idEducacion;
    private String titulo;
    private LocalDate fechafin;
    private String institucion;
    private String institucionurl;
    private String fotourl;
    private int persona;

    public EducacionEntidad(Long idEducacion, String titulo, LocalDate fechafin, String institucion, String institucionurl, String fotourl, int persona) {
        this.idEducacion = idEducacion;
        this.titulo = titulo;
        this.fechafin = fechafin;
        this.institucion = institucion;
        this.institucionurl = institucionurl;
        this.fotourl = fotourl;
        this.persona = persona;
    }

    public EducacionEntidad() {
    }

    public Long getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(Long idEducacion) {
        this.idEducacion = idEducacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getInstitucionurl() {
        return institucionurl;
    }

    public void setInstitucionurl(String institucionurl) {
        this.institucionurl = institucionurl;
    }

    public String getFotourl() {
        return fotourl;
    }

    public void setFotourl(String fotourl) {
        this.fotourl = fotourl;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "EducacionEntidad{" + "idEducacion=" + idEducacion + ", titulo=" + titulo + ", fechafin=" + fechafin + ", institucion=" + institucion + ", institucionurl=" + institucionurl + ", fotourl=" + fotourl + ", persona=" + persona + '}';
    }
 
    
}
