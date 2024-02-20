package com.example.pockerplanning.services.Interface;

import com.example.pockerplanning.entities.Analyse;


import java.util.List;

public interface IAnalyseService {
    Analyse ajouterAnalyse(Analyse analyse);
    List<Analyse> afficherAnalyse();
    Analyse afficher_one_Analyse(int id);
    void deleteAnalyse(int id);
    Analyse updateAnalyse(Analyse e, int id_analyse);
    //get Analyse par ordre des Sprints
 List<Analyse> getAnalyse_par_ordre_chronologique();

}
