package com.example.pockerplanning.entities;

import jakarta.persistence.*;
import lombok.*;

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
    private Date start_date;
    private String estimation;

    @OneToOne
    private Chat chat;

   // @OneToOne
    //private Historique historique;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="session")
    private List<Ticket> Tickets;



}
