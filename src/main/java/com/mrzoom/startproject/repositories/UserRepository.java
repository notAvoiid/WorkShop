package com.mrzoom.startproject.repositories;

import com.mrzoom.startproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
