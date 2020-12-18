package com.informatori.api.controller;


import org.springframework.data.jpa.repository.JpaRepository;
import com.informatori.api.model.User;

public interface UserController extends JpaRepository<User, Long> {
    
}


