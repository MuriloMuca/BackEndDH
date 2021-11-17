package com.dh.aula20.service;



import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

@Service
public class PacienteService {

    private static Map<Integer, Paciente> flyweight = new HashMap<>();

    private static String[] nomes = {"Lucas", "Paulo"};

    private static String[] sobrenomes = {"Silva", "Sauro"};


    public Map<Integer, Paciente> buscarPaciente(){
        return flyweight;
    }

    public Paciente criarPaciente() {

        Random random = new Random();
        Integer limiteRandom = 2;
        String nome = nomes[random.nextInt(limiteRandom)];
        String sobrenome = sobrenomes[random.nextInt(limiteRandom)];
        String email = nome.toLowerCase() + sobrenome.toLowerCase() + "@gmail.com";
        Integer id = flyweight.size() + 1;
        flyweight.put(id, new Paciente(nome, sobrenome, email, (random.nextInt(45 - 18 + 1) + 18)));

        return flyweight.
    }