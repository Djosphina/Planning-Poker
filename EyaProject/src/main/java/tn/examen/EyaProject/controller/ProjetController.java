package tn.examen.EyaProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.examen.EyaProject.entity.Algorithme;
import tn.examen.EyaProject.entity.Projet;
import tn.examen.EyaProject.services.IalgorithmeService;
import tn.examen.EyaProject.services.IprojetService;

import java.util.List;

@RestController
@RequestMapping("/Projet")
public class ProjetController {
    @Autowired
    IprojetService projetService;

    @PostMapping("/add")
    @ResponseBody
    public Projet addProjet(@RequestBody Projet projet)

    {
        return projetService.addProjet(projet);



    }
// http://localhost:8089/SpringMVC/operateur/retrieve-operateur/8

    @GetMapping("/retrieve-projet/{projet-id}")

    @ResponseBody

    public Projet retrieveProjet(@PathVariable(value = "projet-id") Long id) {

        return projetService.retrieveProjet(id);

    }

    @GetMapping("/retrieve-all-projets")
    @ResponseBody
    public List<Projet> getProjets() {

        return projetService.retrieveallProjets();
    }


    @PutMapping("/modify-projet")

    @ResponseBody

    public Projet modifyProjet(@RequestBody Projet projet) {

        return projetService.updateProjet(projet);

    }




    @DeleteMapping("/remove-projet/{projet-id}")

    @ResponseBody

    public void removeProjet(@PathVariable("projet-id") Long id) {

        projetService.deleteProjet(id);

    }
}
