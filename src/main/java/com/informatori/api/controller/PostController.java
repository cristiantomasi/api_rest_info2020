package com.informatori.api.controller;


import org.springframework.data.jpa.repository.JpaRepository;
import com.informatori.api.model.Post;


public interface PostController extends JpaRepository<Post, Long> {
    
}




/* package com.informatori.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.informatori.api.model.Post;
import com.informatori.api.repository.PostRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("post")
public class PostController {
    
    //GET todos los POST

    @Autowired
    private PostRepository postRepository;

    @GetMapping
    public ResponseEntity<?> getPosts() {
        return new ResponseEntity<>(postRepository.findAll(), HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<?> createPost(@RequestBody Post post) {
    
        
        return new ResponseEntity<>(postRepository.save(post), HttpStatus.CREATED);
    }
    
}

 */