package tn.examen.EyaProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.examen.EyaProject.entity.Carte;
import tn.examen.EyaProject.services.IcarteService;

import java.util.List;

@RestController
@RequestMapping("/Carte")
public class CarteController {

    @Autowired
    IcarteService carteService;

    @PostMapping("/add")
    @ResponseBody
    public Carte addCarte(@RequestBody Carte carte)

    {
        return carteService.addCarte(carte);



    }
// http://localhost:8089/SpringMVC/operateur/retrieve-operateur/8

    @GetMapping("/retrieve-carte/{carte-id}")

    @ResponseBody

    public Carte retrieveCarte(@PathVariable(value = "carte-id") int id) {

        return carteService.retrieveCarte(id);

    }

    @GetMapping("/retrieve-all-cartes")
    @ResponseBody
    public List<Carte> getCartes() {

        return carteService.retrieveallCartes();
    }


    @PutMapping("/modify-carte")

    @ResponseBody

    public Carte modifyCarte(@RequestBody Carte carte) {

        return carteService.updateCarte(carte);

    }




    @DeleteMapping("/remove-carte/{carte-id}")

    @ResponseBody

    public void removeCarte(@PathVariable("carte-id") int id) {

        carteService.deleteCarte(id);

    }


}
