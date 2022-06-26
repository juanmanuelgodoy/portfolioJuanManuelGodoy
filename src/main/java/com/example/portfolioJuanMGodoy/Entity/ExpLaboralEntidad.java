package com.example.portfolioJuanMGodoy.Entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExpLaboralEntidad {
    
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public int idExpLaboral;
private String puesto;
private String descripcion;
private String empresa;
private LocalDate fechainicio;
private LocalDate fechafin;
private String fotourl;
private int persona;

    public ExpLaboralEntidad(int idExpLaboral, String puesto, String descripcion, String empresa, LocalDate fechainicio, LocalDate fechafin, String fotourl, int persona) {
        this.idExpLaboral = idExpLaboral;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.fotourl = fotourl;
        this.persona = persona;
    }

    public ExpLaboralEntidad() {
    }

    public int getIdExpLaboral() {
        return idExpLaboral;
    }

    public void setIdExpLaboral(int idExpLaboral) {
        this.idExpLaboral = idExpLaboral;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
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
        return "ExpLaboralEntidad{" + "idExpLaboral=" + idExpLaboral + ", puesto=" + puesto + ", descripcion=" + descripcion + ", empresa=" + empresa + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin + ", fotourl=" + fotourl + ", persona=" + persona + '}';
    }

}
