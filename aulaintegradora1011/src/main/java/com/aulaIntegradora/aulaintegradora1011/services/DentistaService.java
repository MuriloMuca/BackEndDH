package com.aulaIntegradora.aulaintegradora1011.services;

import com.aulaIntegradora.aulaintegradora1011.domain.Dentista;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DentistaService implements IDentista{

    @Override
    public List<Dentista> listaDentista() {
        List<Dentista> lista = new ArrayList<>();

        // adicionou 3 dentistas a nossa lista
        lista.add(new Dentista(10, "Paulo", "Ross", "1010"));
        lista.add(new Dentista(11, "Paula", "Rossa", "1111"));
        lista.add(new Dentista(12, "Paul", "Russo", "1212"));

        return lista;
    }

    @Override
    public Dentista dentistaPorId(Integer id) {
        return new Dentista(10, "Paulo", "Ross", "1010");
    }
}