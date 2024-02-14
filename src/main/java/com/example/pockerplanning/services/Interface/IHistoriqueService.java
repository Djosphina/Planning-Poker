package com.example.pockerplanning.services.Interface;

import com.example.pockerplanning.entities.Historique;

import java.util.List;

public interface IHistoriqueService {

    Historique ajouterhistorique(Historique historique);
    List<Historique> afficherhistorique();
    Historique afficher_one_historique(int id);
    void deleteHistorique(int id);
    Historique updateHistorique(Historique e, int idEtudiant);
}
