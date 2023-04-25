package com.mrzoom.startproject.controllers;

import com.mrzoom.startproject.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Maria","Maria@gmail.com", "9999999", "123");
        return ResponseEntity.ok().body(u);
    }
}
