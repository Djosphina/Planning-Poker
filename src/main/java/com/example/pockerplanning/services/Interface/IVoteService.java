package com.example.pockerplanning.services.Interface;

import com.example.pockerplanning.entities.Session;
import com.example.pockerplanning.entities.Ticket;
import com.example.pockerplanning.entities.Vote;
import org.springframework.http.ResponseEntity;

public interface IVoteService {
    public ResponseEntity<?> GetAllVoteByTickets(Long id);
    public ResponseEntity<?> AddVote(Vote vote , Long idsession , Long idTicket);
}
