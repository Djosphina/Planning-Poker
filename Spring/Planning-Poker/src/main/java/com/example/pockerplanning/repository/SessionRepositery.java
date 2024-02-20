package com.example.pockerplanning.repository;

import com.example.pockerplanning.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepositery extends JpaRepository<Session , Long> {
}
