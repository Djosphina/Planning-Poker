package com.example.pockerplanning.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser ;
    private String  nom;
    private String  prenom;
    private  String username;
    private String mail;
    private String mdp;
    private Date date_naissance;
    @Enumerated(EnumType.STRING)
    private Sexe sexe;
    private String adresse ;
    private String num;
    private boolean Status;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String image;

    @ManyToMany(cascade = {CascadeType.ALL})
    private Set<Equipe> equipes;



}
