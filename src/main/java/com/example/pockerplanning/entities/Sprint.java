package com.example.pockerplanning.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Sprint")
public class Sprint implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSprint")
    private long id;
    private String self;
    private String state;
    private String name;
    private String startDate;
    private String endDate;
    private String createdDate;
    private long originBoardId;
    private String goal;


    @ManyToOne
    Projet projet;
    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "sprint")
    private Set<Ticket> Tickets;



}