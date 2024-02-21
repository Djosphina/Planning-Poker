package com.example.pockerplanning.services.impl;

import com.example.pockerplanning.entities.Session;
import com.example.pockerplanning.entities.Ticket;
import com.example.pockerplanning.entities.Vote;
import com.example.pockerplanning.repository.SessionRepositery;
import com.example.pockerplanning.repository.TicketRepository;
import com.example.pockerplanning.repository.VoteRepositery;
import com.example.pockerplanning.services.Interface.IVoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VoteService implements IVoteService {
    @Autowired
    private VoteRepositery voteRepositery ;
    @Autowired
    private SessionRepositery sessionRepositery ;
    @Autowired
    private TicketRepository ticketRepository ;



    @Override
    public ResponseEntity<?> GetAllVoteByTickets(Long id) {
        List<Vote> votes = voteRepositery.getVoteByTicket_Id(id);

        Map<Integer, Integer> voteCountsByComplexity = new HashMap<>();
        for (Vote vote : votes) {
            int complexity = Integer.parseInt(vote.getEstimation());
            voteCountsByComplexity.put(complexity, voteCountsByComplexity.getOrDefault(complexity, 0) + 1);
        }
        return ResponseEntity.status(HttpStatus.OK).body(voteCountsByComplexity);
    }

    @Override
    public ResponseEntity<?> AddVote(Vote vote, Long idsession , Long idTicket) {
        Session session = sessionRepositery.findById(idsession).orElse(null) ;
        Ticket t = ticketRepository.findById(idTicket).orElse(null) ;
        vote.setTicket(t);
        vote.setSessionV(session);
        voteRepositery.save(vote) ;

        return ResponseEntity.status(HttpStatus.CREATED).body(vote);
    }

}
