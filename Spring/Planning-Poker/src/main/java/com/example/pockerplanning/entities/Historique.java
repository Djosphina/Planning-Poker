package com.example.pockerplanning.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Historique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_historique;
    private String description;
    private int estimation_finale;
    private Date date;


    @OneToOne
    private Session session;
  //  private Affectation Affectation;
  //  private int estimation_initial;
   // private Session session;
   // private List<Vote> vote;




}
