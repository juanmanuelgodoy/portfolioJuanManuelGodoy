package com.example.portfolioJuanMGodoy.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SkillEntidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long idSkill;
    private String titulo;
    private int dominio;
    private int persona;

    public SkillEntidad(Long idSkill, String titulo, int dominio, int persona) {
        this.idSkill = idSkill;
        this.titulo = titulo;
        this.dominio = dominio;
        this.persona = persona;
    }

    public SkillEntidad() {
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
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
