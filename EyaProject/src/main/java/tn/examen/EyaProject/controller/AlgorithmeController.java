package tn.examen.EyaProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.examen.EyaProject.entity.Algorithme;
import tn.examen.EyaProject.services.IalgorithmeService;
import tn.examen.EyaProject.services.IcarteService;

import java.util.List;
@RestController
@RequestMapping("/Algorithme")
public class AlgorithmeController {

        @Autowired
        IalgorithmeService algorithmeService;

        @PostMapping("/add")
        @ResponseBody
        public Algorithme addAlgorithme(@RequestBody Algorithme algorithme)

        {
            return algorithmeService.addAlgorithme(algorithme);



        }
// http://localhost:8089/SpringMVC/operateur/retrieve-operateur/8

        @GetMapping("/retrieve-algorithme/{algorithme-id}")

        @ResponseBody

        public Algorithme retrieveAlgorithme(@PathVariable(value = "algorithme-id") Long id) {

            return algorithmeService.retrieveAlgorithme(id);

        }

        @GetMapping("/retrieve-all-algorithmes")
        @ResponseBody
        public List<Algorithme> getAlgorithmes() {

            return algorithmeService.retrieveallAlgorithmes();
        }


        @PutMapping("/modify-algorithme")

        @ResponseBody

        public Algorithme modifyAlgorithme(@RequestBody Algorithme algorithme) {

            return algorithmeService.updateAlgorithme(algorithme);

        }




        @DeleteMapping("/remove-algorithme/{algorithme-id}")

        @ResponseBody

        public void removeAlgorithme(@PathVariable("algorithme-id") Long id) {

            algorithmeService.deleteAlgorithme(id);

        }


}
