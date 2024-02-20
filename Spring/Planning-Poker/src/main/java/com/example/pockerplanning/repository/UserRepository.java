package com.example.pockerplanning.repository;

import com.example.pockerplanning.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
