package com.dh.aula29.controller;

import com.dh.aula29.persistence.entities.JogadorEntity;
import com.dh.aula29.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JogadorController {
    @Autowired
    private JogadorService service;

    @GetMapping("/jogador")
    public ResponseEntity<List<JogadorEntity>> buscarTodos(){
        return ResponseEntity.ok(service.buscarTodos())
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> salvar(@RequestBody JogadorEntity)
}
