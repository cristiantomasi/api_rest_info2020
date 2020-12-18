package com.informatori.api.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String titulo;
    private String descripcion;
    private String contenido;
    private LocalDate fecha_creacion = LocalDate.now();
    private Long autor;
    private Boolean publicado = false;

    public Long getId() {
        return this.id;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public void setId(Long id) {
	this.id = id;
}


    public String getTitulo() {
    	return this.titulo;
    }
    public void setTitulo(String titulo) {
    	this.titulo = titulo;
    }


    public String getDescripcion() {
    	return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
    	this.descripcion = descripcion;
    }


    public String getContenido() {
    	return this.contenido;
    }
    public void setContenido(String contenido) {
    	this.contenido = contenido;
    }


    public Long getAutor() {
    	return this.autor;
    }
    public void setAutor(Long autor) {
    	this.autor = autor;
    }


    public Boolean getPublicado() {
    	return this.publicado;
    }
    public void setPublicado(Boolean publicado) {
    	this.publicado = publicado;
    }

	public void save(Post posteo) {
	}


 
}

