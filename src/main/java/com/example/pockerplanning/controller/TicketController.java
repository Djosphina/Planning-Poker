package com.example.pockerplanning.controller;

import com.example.pockerplanning.entities.Ticket;
import com.example.pockerplanning.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketRepository ticketRepository ;


    @GetMapping("/getlist/{idSession}")
    public List<Ticket> findBySession(@PathVariable Long idSession){
        return  this.ticketRepository.findTicketsBySession_Id(idSession) ;
    }
}
