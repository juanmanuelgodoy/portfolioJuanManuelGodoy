package com.example.portfolioJuanMGodoy.Entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class ExpLaboral {
    
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
private String id;
private String puesto;
private String descripcion;
private String empresa;
private LocalDate fechainicio;
private LocalDate fechafin;
private String fotourl;
private int persona;

    public ExpLaboral(String id, String puesto, String descripcion, String empresa, LocalDate fechainicio, LocalDate fechafin, String fotourl, int persona) {
        this.id = id;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.fotourl = fotourl;
        this.persona = persona;
    }

    public ExpLaboral() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "ExpLaboralEntidad{" + "id=" + id + ", puesto=" + puesto + ", descripcion=" + descripcion + ", empresa=" + empresa + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin + ", fotourl=" + fotourl + ", persona=" + persona + '}';
    }

}
