package com.example.pockerplanning.controller;

import com.example.pockerplanning.entities.Analyse;
import com.example.pockerplanning.entities.Historique;
import com.example.pockerplanning.services.Interface.IAnalyseService;
import com.example.pockerplanning.services.Interface.IHistoriqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AnalyseController {

    @Autowired
    IAnalyseService analyseService;

    //http://localhost:8088/Spring/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-Analyses")
    @ResponseBody
    public List<Analyse> getAnalyses() {
        List<Analyse> listAnalyse = analyseService.afficherAnalyse();
        return listAnalyse;
    }
    @GetMapping("/getAnalyses_par_projets")
    @ResponseBody
    public List<Analyse> getAnalyses_par_projets() {
        List<Analyse> listAnalyse = analyseService.afficherAnalyse_projet();
        return listAnalyse;
    }
    @GetMapping("/getAnalyses_par_us")
    @ResponseBody
    public List<Analyse> getAnalyses_par_Us() {
        List<Analyse> listAnalyse = analyseService.afficherAnalyse_Us();
        return listAnalyse;
    }

    // http://localhost:8088/Spring/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-Analyse/{Analyse-id}")
    @ResponseBody
    public Analyse retrieveHistorique(@PathVariable("Analyse-id") int id) {
        return analyseService.afficher_one_Analyse(id);
    }
    @GetMapping("/retrieve-Analyse_par_sprint_par_ordre/{Analyse-id}")
    public List<Analyse> retrieve_Analyse_par_sprint() {
        return analyseService.getAnalyse_par_ordre_chronologique();
    }

    // http://localhost:8088/Spring/etudiant/add-etudiant
    @PostMapping("/add-Analyse")
    @ResponseBody
    public Analyse addAnalyse(@RequestBody Analyse ae)
    {
        Analyse analyse = analyseService.ajouterAnalyse(ae);
        return analyse;
    }

    // http://localhost:8088/Spring/etudiant/update-etudiant/{etudiant-id}
    @PutMapping("/update-Analyse/{Analyse-id}")
    @ResponseBody
    public Analyse updateAnalyse(@PathVariable("Analyse-id") int id, @RequestBody Analyse ue) {
        ue.setId(id);
        return analyseService.updateAnalyse(ue, id);
    }

    // http://localhost:8088/Spring/etudiant/delete-etudiant/{etudiant-id}
    @DeleteMapping("/delete-Analyse/{Analyse-id}")
    @ResponseBody
    public void deleteAnalyse(@PathVariable("Analyse-id") int id) {
        analyseService.deleteAnalyse(id);
    }
}
