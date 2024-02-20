package com.example.pockerplanning.repository;

import com.example.pockerplanning.entities.Analyse;
import com.example.pockerplanning.entities.Historique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnalyseRepository  extends JpaRepository<Analyse, Integer> {
    //get Analyse par ordre des Sprints
    @Query("Select a from Analyse a order by a.ticket.sprint.createdDate")
    List<Analyse> getAnalyseparsprint();

    @Query("Select a from Analyse a where  a.ticket =null ")
    List<Analyse> getAnalys_projet();

    @Query("Select a from Analyse a where  a.projet =null ")
    List<Analyse> getAnalys_Us();

}
