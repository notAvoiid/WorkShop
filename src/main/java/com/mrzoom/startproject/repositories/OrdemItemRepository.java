package com.mrzoom.startproject.repositories;

import com.mrzoom.startproject.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemItemRepository extends JpaRepository<OrderItem,Long> {
}
