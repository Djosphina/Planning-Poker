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
public class Algorithme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    @ManyToMany(mappedBy = "algorithmes")
    private List<Projet> projets;
    @ManyToMany(cascade = {CascadeType.ALL})
    private List<Carte> cartes;

    /*
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Algorithme other)) {
            return false;
        }

        if (!other.canEqual(this)) {
            return false;
        }

        // Compare IDs
        if (this.getId() != other.getId()) {
            return false;
        }

        // Compare properties related to the many-to-many relationship
        // Assuming you have a collection of Carte entities in Algorithme
        return Objects.equals(this.getNom(), other.getNom());
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Algorithme;
    }

    public int hashCode() {
        final int PRIME = 31; // Choose a prime number as the multiplier
        int result = 1;
        result = result * PRIME + this.getId();
        Object $nom = this.getNom();
        result = result * PRIME + ($nom == null ? 0 : $nom.hashCode());
        return result;
    }
*/

}
