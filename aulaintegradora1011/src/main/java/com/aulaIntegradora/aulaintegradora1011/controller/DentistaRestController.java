package com.aulaIntegradora.aulaintegradora1011.controller;

import com.aulaIntegradora.aulaintegradora1011.domain.Dentista;
import com.aulaIntegradora.aulaintegradora1011.services.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dentista")

public class DentistaRestController {
    @Autowired
    public DentistaService service;

    @GetMapping("lista")
    public List<Dentista> dentista(){
        return service.listaDentista();
    }

    @GetMapping("/id/{id}")
    public Dentista dentistaPorId(@PathVariable Integer id){
        return service.dentistaPorId(id);
    }

}