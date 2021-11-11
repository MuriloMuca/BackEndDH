package com.aulaIntegradora.aulaintegradora1011.services;

import com.aulaIntegradora.aulaintegradora1011.domain.Dentista;

import java.util.List;

public interface IDentista {

    //criar metodos descritos no exercicio

    List<Dentista> listaDentista(); // chamar lista de Dentistas

    Dentista dentistaPorId(Integer id); // chamar lista pelo Id
}