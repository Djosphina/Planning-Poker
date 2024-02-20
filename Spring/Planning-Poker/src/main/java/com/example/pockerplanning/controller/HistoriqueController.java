package com.example.pockerplanning.controller;

import com.example.pockerplanning.entities.Historique;
import com.example.pockerplanning.services.Interface.IHistoriqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/historique")
@RestController
public class HistoriqueController {
    @Autowired
    IHistoriqueService historiqueService;

    //http://localhost:8088/Spring/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-Historiques")
    @ResponseBody
    public List<Historique> getHistoriques() {
        List<Historique> listHistorique = historiqueService.afficherhistorique();
        return listHistorique;
    }
    // http://localhost:8088/Spring/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-Historique/{Historique-id}")
    @ResponseBody
    public Historique retrieveHistorique(@PathVariable("Historique-id") int HistoriqueId) {
        return historiqueService.afficher_one_historique(HistoriqueId);
    }

    // http://localhost:8088/Spring/etudiant/add-etudiant
    @PostMapping("/add-Historique")
    @ResponseBody
    public Historique addHistorique(@RequestBody Historique ae)
    {
        Historique historique = historiqueService.ajouterhistorique(ae);
        return historique;
    }

    // http://localhost:8088/Spring/etudiant/update-etudiant/{etudiant-id}
    @PutMapping("/update-Historique/{Historique-id}")
    @ResponseBody
    public Historique updateHistorique(@PathVariable("Historique-id") int idHistorique, @RequestBody Historique ue) {
        ue.setId_historique(idHistorique);
        return historiqueService.updateHistorique(ue, idHistorique);
    }

    // http://localhost:8088/Spring/etudiant/delete-etudiant/{etudiant-id}
    @DeleteMapping("/delete-Historique/{Historique-id}")
    @ResponseBody
    public void deleteHistorique(@PathVariable("Historique-id") int HistoriqueId) {
        historiqueService.deleteHistorique(HistoriqueId);
    }

}
