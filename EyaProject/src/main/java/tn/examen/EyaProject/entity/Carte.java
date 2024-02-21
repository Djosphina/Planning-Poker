package tn.examen.EyaProject.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Carte {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int idc;
    private String valeur;
    private String img;


}
