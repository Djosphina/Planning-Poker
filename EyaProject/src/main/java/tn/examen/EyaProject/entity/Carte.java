package tn.examen.EyaProject.entity;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;


@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Carte {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int id;
    private String valeur;
    private String img;

    @ManyToMany(mappedBy = "cartes")
    private List<Algorithme> algorithmes;



    /*
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Carte carte)) {
            return false;
        }

        if (!carte.canEqual(this)) {
            return false;
        }

        if (this.getId() != carte.getId()) {
            return false;
        }

        if (!Objects.equals(this.getValeur(), carte.getValeur())) {
            return false;
        }

        return Objects.equals(this.getImg(), carte.getImg());
    }


    protected boolean canEqual(final Object other) {
        return other instanceof Carte;
    }

    public int hashCode() {
        final int PRIME = 31; // Choose a prime number as the multiplier
        int result = 1;
        result = result * PRIME + this.getId();
        Object $valeur = this.getValeur();
        result = result * PRIME + ($valeur == null ? 0 : $valeur.hashCode());
        Object $img = this.getImg();
        result = result * PRIME + ($img == null ? 0 : $img.hashCode());
        return result;
    }*/



}
