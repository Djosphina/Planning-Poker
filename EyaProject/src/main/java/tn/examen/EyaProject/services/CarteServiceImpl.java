package tn.examen.EyaProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.examen.EyaProject.dao.CarteRepository;
import tn.examen.EyaProject.entity.Carte;

import java.util.List;

@Service
public class CarteServiceImpl implements IcarteService {

    @Autowired
    CarteRepository carter;


    @Override
    public Carte addCarte(Carte carte) {
        return carter.save(carte);
    }

    @Override
    public Carte retrieveCarte(int id) {
        return carter.findById(id).orElse(null);
    }
    @Override
    public List<Carte> retrieveallCartes() {
        return (List<Carte>) carter.findAll();
    }


    @Override
    public Carte updateCarte(Carte carte) {
        return carter.save(carte);
    }

    @Override
    public void deleteCarte(int id) {
        carter.deleteById(id);
    }
}
