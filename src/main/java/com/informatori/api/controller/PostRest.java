package com.informatori.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.informatori.api.model.Post;


@RestController
@RequestMapping("posts")
public class PostRest {
    @Autowired
    private PostController posteo;
    
    @PostMapping("/guardar")
    public void guardar(@RequestBody Post posteo){
        posteo.save(posteo);
    }

    @GetMapping("/listpost")
    public List<Post> listpost(){
        return posteo.findAll();
    }


}
