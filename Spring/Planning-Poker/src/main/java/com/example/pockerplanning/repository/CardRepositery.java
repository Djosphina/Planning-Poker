package com.example.pockerplanning.repository;

import com.example.pockerplanning.entities.Carte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepositery  extends JpaRepository<Carte , Long> {
}
