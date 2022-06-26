package com.example.portfolioJuanMGodoy.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonaEntidad {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String titulo;
    private String telefono;
    private String ubicacion;
    private String acerca;
    private String fotourl;
    private String coverurl;
    private String username;
    private String password;

    public PersonaEntidad(int idPersona, String nombre, String apellido, String email, String titulo, String telefono, String ubicacion, String acerca, String fotourl, String coverurl, String username, String password) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.titulo = titulo;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.acerca = acerca;
        this.fotourl = fotourl;
        this.coverurl = coverurl;
        this.username = username;
        this.password = password;
    }

    public PersonaEntidad() {
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getAcerca() {
        return acerca;
    }

    public void setAcerca(String acerca) {
        this.acerca = acerca;
    }

    public String getFotourl() {
        return fotourl;
    }

    public void setFotourl(String fotourl) {
        this.fotourl = fotourl;
    }

    public String getCoverurl() {
        return coverurl;
    }

    public void setCoverurl(String coverurl) {
        this.coverurl = coverurl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PersonaEntidad{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", titulo=" + titulo + ", telefono=" + telefono + ", ubicacion=" + ubicacion + ", acerca=" + acerca + ", fotourl=" + fotourl + ", coverurl=" + coverurl + ", username=" + username + ", password=" + password + '}';
    }

	
}