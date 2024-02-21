package com.example.pockerplanning.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime startDate;
    private LocalDateTime Enddate ;
    private String estimation;



    @OneToMany( mappedBy="session")
    @JsonIgnore
    private List<Ticket> TicketsList;


    @OneToMany( mappedBy="sessionV")
    @JsonIgnore
    private List<Vote> voteList ;


    @OneToMany( mappedBy="sessionC")
    @JsonIgnore
    private List<Chat> chatList ;







}
