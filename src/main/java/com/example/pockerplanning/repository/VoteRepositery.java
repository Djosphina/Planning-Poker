package com.example.pockerplanning.repository;

import com.example.pockerplanning.entities.Ticket;
import com.example.pockerplanning.entities.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoteRepositery extends JpaRepository<Vote , Long> {
    List<Vote> getVoteByTicket_Id(Long id) ;
}
