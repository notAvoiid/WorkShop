package com.mrzoom.startproject.services;

import com.mrzoom.startproject.entities.Product;
import com.mrzoom.startproject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Product findUserByiId(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
