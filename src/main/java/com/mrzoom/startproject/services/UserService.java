package com.mrzoom.startproject.services;

import com.mrzoom.startproject.entities.User;
import com.mrzoom.startproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User findUserByiId(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }
}
