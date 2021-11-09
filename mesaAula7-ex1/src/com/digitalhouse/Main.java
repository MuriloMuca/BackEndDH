package com.digitalhouse;

import com.digitalhouse.model.Arvore;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArvoreFactory factory = new ArvoreFactory();

        Arvore ornamentais = factory.getArvore(200,400, "verde");
        Arvore frutiferas = factory.getArvore(500, 300, "vermelha");
        // Arvore floriferas = factory.getArvore(100,200,"azul");

        List<Arvore> arvoreList = new ArrayList<>();
        for(int i = 0; i<=500000; i++){
            arvoreList.add(ornamentais);
            arvoreList.add(frutiferas);
            }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria utilizada: " + (runtime.totalMemory() + runtime.freeMemory() / (1024 * 1024)));

    }
}
