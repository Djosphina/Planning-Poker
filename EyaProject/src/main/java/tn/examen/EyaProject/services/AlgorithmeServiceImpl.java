package tn.examen.EyaProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.examen.EyaProject.dao.AlgorithmeRepository;
import tn.examen.EyaProject.entity.Algorithme;
import tn.examen.EyaProject.entity.Carte;

import java.util.List;

@Service
public class AlgorithmeServiceImpl implements IalgorithmeService {

    @Autowired
    AlgorithmeRepository algorithmer;
    @Override
    public Algorithme addAlgorithme(Algorithme algorithme) {
        return algorithmer.save(algorithme);
    }

    @Override
    public Algorithme retrieveAlgorithme(Long id) {
        return  algorithmer.findById(id).orElse(null);
    }

    @Override
    public List<Algorithme> retrieveallAlgorithmes() {
        return (List<Algorithme>) algorithmer.findAll();
    }


    @Override
    public Algorithme updateAlgorithme(Algorithme algorithme) {
        return algorithmer.save(algorithme);
    }

    @Override
    public void deleteAlgorithme(Long id) {
        algorithmer.deleteById(id);
    }
}
