package com.mrzoom.startproject.controllers;

import com.mrzoom.startproject.entities.Category;

import com.mrzoom.startproject.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryController;
    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = categoryController.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> findUserById(@PathVariable Long id){
        Category obj = categoryController.findUserByiId(id);
        return ResponseEntity.ok().body(obj);
    }
}
