package com.example.pockerplanning.repository;

import com.example.pockerplanning.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
