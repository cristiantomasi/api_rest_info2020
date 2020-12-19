package com.informatori.api.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import com.informatori.api.model.Comment;


public interface CommentController extends JpaRepository<Comment, Long>{
    
}
