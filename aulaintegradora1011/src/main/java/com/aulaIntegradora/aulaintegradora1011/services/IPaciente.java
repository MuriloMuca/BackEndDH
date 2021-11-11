package com.aulaIntegradora.aulaintegradora1011.services;

import com.aulaIntegradora.aulaintegradora1011.domain.Paciente;

import java.util.List;

public interface IPaciente {

    List<Paciente> listarPacientes();

    Paciente pacientePorEmail(String email);
}
