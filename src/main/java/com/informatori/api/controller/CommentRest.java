package com.informatori.api.controller;

import com.informatori.api.model.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("comments")
public class CommentRest {  
    @Autowired
    private CommentController comentario;

    @PostMapping("/guardar")
    public void guardar(@RequestBody Comment comment){
        comentario.save(comment);
    }

    @GetMapping("/listarcomment")
    public List<Comment> listcomment(){
        return comentario.findAll();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Long id){
        comentario.deleteById(id);
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody Comment comment){
        comentario.save(comment);
    }


    
}
