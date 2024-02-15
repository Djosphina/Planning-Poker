package com.example.pockerplanning.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long utilisateurId;
    private String description;
    @Enumerated(EnumType.STRING)
    private Priorite priorite;
    @Enumerated(EnumType.STRING)
    private Statut statut;
    private String pieceJointe;
    private Date dateSoumission;
    private Date dateMiseAJour;
    private Long utilisateurTraitantId;
    @ManyToOne
    Projet projet;
}
