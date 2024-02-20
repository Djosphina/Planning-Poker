package com.example.pockerplanning.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Carte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idc;
    private String valeur;
    private String img;

}
