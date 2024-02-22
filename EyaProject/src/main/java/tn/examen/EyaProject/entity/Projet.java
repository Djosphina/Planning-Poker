package tn.examen.EyaProject.entity;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String objectif;
    private Date date_debut;
    private Date date_fin;
    private float duree;
    private String methodologie;
    private String methode;
    private String contraintes;
    private String exigences;
    private String dependance;
    private float budget;
    private int status;

    @ManyToMany
    private List<Algorithme> algorithmes;

    ///relation avec equipe
    @ManyToMany(mappedBy = "projets" )
    private Set<Equipe> equipes;

    //relation avec sprint
    @ManyToMany
    private Set<Sprint> sprints;


    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Projet projet)) {
            return false;
        }

        if (!projet.canEqual(this)) {
            return false;
        }

        if (this.getId() != projet.getId()) {
            return false;
        }

        return Objects.equals(this.getTitre(), projet.getTitre());
    }



    protected boolean canEqual(final Object other) {
        return other instanceof Projet;
    }

    public int hashCode() {
        final int PRIME = 31; // Choose a prime number as the multiplier
        int result = 1;
        result = result * PRIME + (int) (this.getId() ^ (this.getId() >>> 32));
        Object $titre = this.getTitre();
        result = result * PRIME + ($titre == null ? 0 : $titre.hashCode());
        return result;
    }



}
