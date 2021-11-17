package com.dh.aula21.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pokemon {

    private String nome;
    private String tipo;
    private Integer pokedex;
    private String[] habilidade;

    public Pokemon(String nome, String tipo, Integer pokemon, String[] habilidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.pokedex = pokemon;
        this.habilidade = habilidade;
    }

}
