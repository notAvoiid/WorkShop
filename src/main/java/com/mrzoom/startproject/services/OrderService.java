package com.mrzoom.startproject.services;

import com.mrzoom.startproject.entities.Order;
import com.mrzoom.startproject.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }
    public Order findOrderByiId(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
