package com.example.pockerplanning.repository;

import com.example.pockerplanning.entities.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SprintRepository extends JpaRepository<Sprint, Long> {
}
