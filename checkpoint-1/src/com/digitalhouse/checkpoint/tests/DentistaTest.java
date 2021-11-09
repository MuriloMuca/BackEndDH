package com.digitalhouse.checkpoint.tests;

import com.digitalhouse.checkpoint.config.ConnectionH2;
import com.digitalhouse.checkpoint.dao.ServidorH2;
import model.Dentista;
import org.apache.log4j.BasicConfigurator;
import org.junit.jupiter.api.*;

public class DentistaTest {

    ServidorH2 servidor = new ServidorH2();

    @BeforeAll
    static void antes() {
        BasicConfigurator.configure();
    }

    @Test
    void selectTest(){

        ConnectionH2 config = new ConnectionH2();

        Dentista dentista1 = new Dentista(03, "Lucas", "Lima");
        Dentista dentista2 = new Dentista(04, "Mariana", "Ventura");
        Dentista dentista3 = new Dentista(05, "Fabio", "Barreto");

        servidor.createTable();
        servidor.insert(dentista1);
        servidor.insert(dentista2);
        servidor.insert(dentista3);
        servidor.selectAll();

        String resultado1 = "Lucas";
        String resultado2 = "04";
        String resultado3 = "Barreto";

        Assertions.assertEquals(resultado1, dentista1.getNome());
        Assertions.assertEquals(resultado2, dentista2.getMatricula());
        Assertions.assertEquals(resultado3, dentista3.getSobrenome());

    }
}
