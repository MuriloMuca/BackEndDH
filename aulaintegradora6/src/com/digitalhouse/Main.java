package com.digitalhouse;

import service.ISerie;
import service.SerieProxy;
import service.SerieService;

public class Main {

    public static void main(String[] args) {

        String [] series = {"Round6", "100s", "Lucifer", "BlindSpot", "Startrek", "Round6"};

        ISerie link = new SerieProxy(new SerieService());

        for (String serie : series) {
            System.out.println(link.getSerie(serie));
        }
    }
}
