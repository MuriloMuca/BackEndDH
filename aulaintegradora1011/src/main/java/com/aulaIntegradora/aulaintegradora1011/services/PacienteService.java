package com.aulaIntegradora.aulaintegradora1011.services;

import com.aulaIntegradora.aulaintegradora1011.domain.Dentista;
import com.aulaIntegradora.aulaintegradora1011.domain.Endereco;
import com.aulaIntegradora.aulaintegradora1011.domain.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PacienteService implements IPaciente{
    @Override
    public List<Paciente> listarPacientes() {
        List<Paciente> lista = new ArrayList<>();

        lista.add(new Paciente(8126, "Murilo", "Cesar", "muca@hotmail.com", "12345698710", new Date(), new Endereco("Rua Dez", "123", "Salto", "SP"), new Dentista(15, "Raul", "Cizo", "1010")));
        lista.add(new Paciente(8126, "Sarah", "Alencar", "jussara@hotmail.com", "12345698810", new Date(), new Endereco("Rua Nove", "123", "Itu", "SP"), new Dentista(15, "Raul", "Cizo", "1010")));
        lista.add(new Paciente(8126, "Maria", "Machado", "maria@hotmail.com", "12345698910", new Date(), new Endereco("Rua Doze", "123", "Indaiatuba", "SP"), new Dentista(15, "Raul", "Cizo", "1010")));

        return lista;
    }



    @Override
    public Paciente pacientePorEmail(String email) {
        return new Paciente(2548, "Paciente", "Por Email",
                email, "12345678910", new Date(), new Endereco("Rua do Paciente", "666", "Guaxupé", "SP"), new Dentista(15, "Raul", "Cizo", "1010"));
    }
}
