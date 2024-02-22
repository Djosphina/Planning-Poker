package tn.examen.EyaProject.services;

import tn.examen.EyaProject.entity.Algorithme;
import tn.examen.EyaProject.entity.Carte;

import java.util.List;

public interface IalgorithmeService {

    Algorithme addAlgorithme(Algorithme algorithme);
    List<Algorithme> retrieveallAlgorithmes();

    Algorithme retrieveAlgorithme(Long id);
    Algorithme updateAlgorithme(Algorithme algorithme);

    void deleteAlgorithme(Long id);

}
