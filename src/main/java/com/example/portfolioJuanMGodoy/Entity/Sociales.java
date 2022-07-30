package com.example.portfolioJuanMGodoy.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Sociales {
  
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;
    private String url;
    private String fotourl;
    private int persona;

    public Sociales(String id, String nombre, String url, String fotourl, int persona) {
        this.id = id;
        this.nombre = nombre;
        this.url = url;
        this.fotourl = fotourl;
        this.persona = persona;
    }

    public Sociales() {
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
        return "SocialesEntidad{" + "id=" + id + ", nombre=" + nombre + ", url=" + url + ", fotourl=" + fotourl + ", persona=" + persona + '}';
    }
    
    
}
