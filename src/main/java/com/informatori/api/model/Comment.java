package com.informatori.api.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long autor;
    private LocalDate fecha_creacion = LocalDate.now();
    @Column(length = 200)
    private String comentario;
    @Column(nullable = false)
    private Long post_id;

    public Long getId() {
        return this.id;
    }

    public Long getPost_id() {
        return post_id;
    }

    public void setPost_id(Long post_id) {
        this.post_id = post_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAutor() {
        return this.autor;
    }
    public void setAutor(Long autor) {
        this.autor = autor;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getComentario() {
        return this.comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    



    
    
}
