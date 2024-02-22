package tn.examen.EyaProject.services;

import tn.examen.EyaProject.entity.Projet;

import java.util.List;

public interface IprojetService {

    Projet addProjet(Projet projet);
    List<Projet> retrieveallProjets();

    Projet retrieveProjet(Long id);
    Projet updateProjet(Projet projet);

    void deleteProjet(Long id);

}
