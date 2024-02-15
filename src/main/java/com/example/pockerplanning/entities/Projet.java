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
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String objectif;
    private Date date_debut;
    private Date date_fin;
    private  String contraintes;
    private String exigences ;
    private String dependance ;
    private float budget;
    private int status  ;
    private ALGORITHME algo;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Carte> cartes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="projet")
    private List<Sprint> Sprints;

    @ManyToOne
    Equipe equipe;

}
