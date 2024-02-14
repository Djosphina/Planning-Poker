package com.example.pockerplanning.services.impl;

import com.example.pockerplanning.entities.Historique;
import com.example.pockerplanning.repository.HistoriqueRepostory;
import com.example.pockerplanning.services.Interface.IHistoriqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriqueService implements IHistoriqueService {

@Autowired
    HistoriqueRepostory historiqueRepostory;
    @Override
    public Historique ajouterhistorique(Historique historique) {
        return historiqueRepostory.save(historique);
    }

    @Override
    public List<Historique> afficherhistorique() {
        return historiqueRepostory.findAll();
    }

    @Override
    public Historique afficher_one_historique(int id) {
        return historiqueRepostory.findById(id).orElse(null);
    }

    @Override
    public void deleteHistorique(int id) {
        Historique h = historiqueRepostory.findById(id).orElse(null);
historiqueRepostory.delete(h);
    }

    @Override
    public Historique updateHistorique(Historique h, int id) {
        Historique historique = historiqueRepostory.findById(id).orElse(null);
        return historiqueRepostory.save(h);

    }
}
