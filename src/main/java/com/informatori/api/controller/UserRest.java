package com.informatori.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.informatori.api.model.User;


@RestController
@RequestMapping("users")
public class UserRest {
    @Autowired
    private UserController usuario;
    
    @PostMapping("/guardar")
    public void guardar(@RequestBody User user){
        usuario.save(user);
    }

    @GetMapping("/listusers")
    public List<User> listusers(){
        return usuario.findAll();
    }


}
