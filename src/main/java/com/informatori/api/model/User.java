package com.informatori.api.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    @Column(unique = true, nullable=false)
    private String email;
    private String password;
    private LocalDate fecha_creacion = LocalDate.now();
    private String ciudad;
    private String provincia;
    private String pais;


public Long getId() {
	return this.id;
}
public void setId(Long id) {
	this.id = id;
}


    public String getNombre() {
    	return this.nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }


    public String getApellido() {
    	return this.apellido;
    }
    public void setApellido(String apellido) {
    	this.apellido = apellido;
    }


    public String getEmail() {
    	return this.email;
    }
    public void setEmail(String email) {
    	this.email = email;
    }


    public String getPassword() {
    	return this.password;
    }
    public void setPassword(String password) {
    	this.password = password;
    }


    public LocalDate getFecha_creacion() {
    	return this.fecha_creacion;
    }
    public void setFecha_creacion(LocalDate fecha_creacion) {
    	this.fecha_creacion = fecha_creacion;
    }


    public String getCiudad() {
    	return this.ciudad;
    }
    public void setCiudad(String ciudad) {
    	this.ciudad = ciudad;
    }


    public String getProvincia() {
    	return this.provincia;
    }
    public void setProvincia(String provincia) {
    	this.provincia = provincia;
    }


    public String getPais() {
    	return this.pais;
    }
    public void setPais(String pais) {
    	this.pais = pais;
    }

}
