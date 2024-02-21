package com.example.pockerplanning.controller;

import com.example.pockerplanning.entities.Vote;
import com.example.pockerplanning.services.impl.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vote")
@CrossOrigin("*")
public class VoteController {
    @Autowired
    private VoteService voteService ;


    @GetMapping("/getAllByTickets/{id}")
    public ResponseEntity<?> GetAllByTickets(@PathVariable Long id){
        return this.voteService.GetAllVoteByTickets(id) ;
    }
    @PostMapping("/AddVote/{idSession}/{idticket}")
    public ResponseEntity<?> AddVote(@PathVariable Long idSession , @PathVariable Long idticket , @RequestBody Vote vote){
        return voteService.AddVote(vote , idSession , idticket) ;
    }
}
