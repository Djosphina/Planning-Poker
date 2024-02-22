package tn.examen.EyaProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.examen.EyaProject.dao.ProjetRepository;
import tn.examen.EyaProject.entity.Carte;
import tn.examen.EyaProject.entity.Projet;

import java.util.List;

@Service
public class ProjetServiceImpl implements IprojetService {

    @Autowired
    ProjetRepository projetr;
    @Override
    public Projet addProjet(Projet projet) {
        return projetr.save(projet);
    }

    @Override
    public List<Projet> retrieveallProjets() {
        return  (List<Projet>) projetr.findAll();
    }

    @Override
    public Projet retrieveProjet(Long id) {
        return projetr.findById(id).orElse(null);
    }

    @Override
    public Projet updateProjet(Projet projet) {
        return projetr.save(projet);
    }

    @Override
    public void deleteProjet(Long id) {
        projetr.deleteById(id);
    }
}
