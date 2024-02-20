package com.example.pockerplanning.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom_equipe;
    private String Description_Equipe;
    private int satisfactionSM;
    private int satisfactionPO;
    private String chat;
    private DISPONIBILITE disponibilites;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="equipe")
    private List<Projet> Projets;
    @ManyToMany(mappedBy = "equipes", cascade = {CascadeType.ALL})
    private Set<User> users;


}
