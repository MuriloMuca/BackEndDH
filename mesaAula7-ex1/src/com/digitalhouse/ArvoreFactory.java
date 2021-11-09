package com.digitalhouse;

import com.digitalhouse.model.Arvore;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static Map<String, Arvore> flyweight = new HashMap<>();

    public Arvore getArvore(Integer altura,Integer largura, String cor) {
        String id = String.format("altura: %$ largura: %$ cor: %$", altura, largura, cor);

        if(!flyweight.containsKey(id)) {
            flyweight.put(id, new Arvore(altura, largura, cor));
            System.out.println("Arvore criada!");
        }
        return flyweight.get(id);
    }
}
