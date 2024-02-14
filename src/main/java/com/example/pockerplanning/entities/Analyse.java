package com.example.pockerplanning.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Analyse implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Description;
    private Date date_analyse;
    @OneToOne
    private Sprint sprint;
    @OneToOne
    private Projet projet;
    @OneToOne
    private Session session;


    // Ticket ticket;
      //  Sprint sprint;
    //User user;


   // List<Session> sessions;
}

