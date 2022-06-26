package com.example.portfolioJuanMGodoy.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SkillEntidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int idSkill;
    private String titulo;
    private int dominio;
    private int persona;

    public SkillEntidad(int idSkill, String titulo, int dominio, int persona) {
        this.idSkill = idSkill;
        this.titulo = titulo;
        this.dominio = dominio;
        this.persona = persona;
    }

    public SkillEntidad() {
    }

    public int getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(int idSkill) {
        this.idSkill = idSkill;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio) {
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
        return "SkillEntidad{" + "idSkill=" + idSkill + ", titulo=" + titulo + ", dominio=" + dominio + ", persona=" + persona + '}';
    }
    
    
}
