package com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Media {

    private Integer[] listaNumeros;
    private Double media;

    public Media(Integer [] listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public Double calcularMedia(){

        double tamanho = this.listaNumeros.length;
        double soma = 0;

        for(double numero : this.listaNumeros){
            soma += numero;
        }

        return (soma/tamanho);
    }

    public Integer [] getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(Integer [] listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
}
