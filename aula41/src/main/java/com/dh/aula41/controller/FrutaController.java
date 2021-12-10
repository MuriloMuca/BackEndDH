package com.dh.aula41.controller;

import com.dh.aula41.service.FrutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FrutaController {

    @Autowired
    private FrutaService service;

    @PostMapping
    public Fruta postFruta(@RequestBody Fruta fruta){
        return service.criarFruta(fruta);
    }

    @DeleteMapping("/{id}")
    public void deleteFruta(@PathVariable Integer id){
        service.deletarFruta(id);
    }

    @GetMapping("/all")
    public List<Fruta> getAll(){
        return service.selectAll();
    }

    @GetMapping("/{id}")
    public Fruta getById(@PathVariable Integer id){
        return service.selectId(id);
    }
}
