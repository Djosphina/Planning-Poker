package com.example.pockerplanning.services.impl;

import com.example.pockerplanning.entities.Analyse;
import com.example.pockerplanning.repository.AnalyseRepository;
import com.example.pockerplanning.services.Interface.IAnalyseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnalyseService implements IAnalyseService {

    @Autowired
    AnalyseRepository analyseRepository;
    @Override
    public Analyse ajouterAnalyse(Analyse analyse) {
        return analyseRepository.save(analyse);
    }

    @Override
    public List<Analyse> afficherAnalyse() {
        return analyseRepository.findAll();
    }

    @Override
    public List<Analyse> afficherAnalyse_projet() {
        return analyseRepository.getAnalys_projet();
    }

    @Override
    public List<Analyse> afficherAnalyse_Us() {
        return analyseRepository.getAnalys_Us();
    }

    @Override
    public Analyse afficher_one_Analyse(int id) {
        return analyseRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteAnalyse(int id) {
        Analyse analyse=analyseRepository.findById(id).orElse(null);
    analyseRepository.delete(analyse);
    }

    @Override
    public Analyse updateAnalyse(Analyse a, int id_analyse) {
        Analyse analyse = afficher_one_Analyse(id_analyse);
        return analyseRepository.save(a);
    }

    @Override
    public List<Analyse> getAnalyse_par_ordre_chronologique() {
        return analyseRepository.getAnalyseparsprint();

    }
}
