package com.example.pockerplanning.repository;

import com.example.pockerplanning.entities.Historique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriqueRepostory extends JpaRepository<Historique, Integer> {

}
