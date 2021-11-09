package com.digitalhouse.checkpoint;

import com.digitalhouse.checkpoint.dao.ServidorH2;
import model.Dentista;
import org.apache.log4j.BasicConfigurator;

public class Main {

    public static void main(String[] args) {

        BasicConfigurator.configure();

        Dentista dentista1 = new Dentista(01, "Joana", "Luiz");
        Dentista dentista2 = new Dentista(02, "Paulo", "Canto");
        Dentista dentista3 = new Dentista(03, "Thomas", "Turbano");

        ServidorH2 servidor = new ServidorH2();

        servidor.createTable();
        servidor.insert(dentista1);
        servidor.insert(dentista2);
        servidor.insert(dentista3);
        servidor.selectAll();

    }
}
