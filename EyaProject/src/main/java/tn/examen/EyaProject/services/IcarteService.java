package tn.examen.EyaProject.services;

import tn.examen.EyaProject.entity.Carte;

import java.util.List;

public interface IcarteService {

    Carte addCarte(Carte carte);
    List<Carte> retrieveallCartes();

    Carte retrieveCarte(int id);
    Carte updateCarte(Carte carte);

    void deleteCarte(int id);

}
