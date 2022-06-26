package com.example.portfolioJuanMGodoy.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SocialesEntidad {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int idSociales;
    private String nombre;
    private String url;
    private String fotourl;
    private int persona;

    public SocialesEntidad(int idSociales, String nombre, String url, String fotourl, int persona) {
        this.idSociales = idSociales;
        this.nombre = nombre;
        this.url = url;
        this.fotourl = fotourl;
        this.persona = persona;
    }

    public SocialesEntidad() {
    }

    public int getIdSociales() {
        return idSociales;
    }

    public void setIdSociales(int idSociales) {
        this.idSociales = idSociales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        return "SocialesEntidad{" + "idSociales=" + idSociales + ", nombre=" + nombre + ", url=" + url + ", fotourl=" + fotourl + ", persona=" + persona + '}';
    }
    
    
}
