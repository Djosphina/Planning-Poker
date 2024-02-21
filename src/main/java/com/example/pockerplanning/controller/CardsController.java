package com.example.pockerplanning.controller;

import com.example.pockerplanning.entities.Carte;
import com.example.pockerplanning.repository.CardRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cards")
@CrossOrigin("*")
public class CardsController {


    @Autowired
    private CardRepositery cardRepositery ;


    @GetMapping("/getall")
    public List<Carte> findall(){
        return  this.cardRepositery.findAll() ;
    }
}
