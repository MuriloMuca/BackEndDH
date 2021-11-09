package com.digitalhouse;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import java.util.List;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

        Integer[] lista = {1,2,3,4,5};
        Media media = new Media(lista);
        media.setMedia(media.calcularMedia());

        if(media.getListaNumeros().length > 10){
            logger.info("Lista de numeros é maior que 10.");
        } else if (media.getListaNumeros().length >= 5) {
            logger.info("Lista de numeros é maior que 5.");
        } else if(media.getListaNumeros().length > 0){
            logger.info("Lista de numeros é menor que 5.");
        } else {
            logger.error("Lista de numeros vazia!");
            return;
        }
        logger.info("A média é igual a " + media.getMedia());

    }
}
