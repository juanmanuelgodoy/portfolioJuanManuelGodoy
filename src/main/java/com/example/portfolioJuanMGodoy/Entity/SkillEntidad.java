package com.example.portfolioJuanMGodoy.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class SkillEntidad {
    
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String titulo;
    private Integer dominio;
    private int persona;

    public SkillEntidad(String id, String titulo, int dominio, Integer persona) {
        this.id = id;
        this.titulo = titulo;
        this.dominio = dominio;
        this.persona = persona;
    }

    public SkillEntidad() {
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

    public Integer getDominio() {
        return dominio;
    }

    public void setDominio(Integer dominio) {
        this.dominio = dominio;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "SkillEntidad{" + "id=" + id + ", titulo=" + titulo + ", dominio=" + dominio + ", persona=" + persona + '}';
    }
    
    
}
