package com.digitalhouse.aula2.service.impl;

import com.digitalhouse.aula2.modal.Funcionario;
import com.digitalhouse.aula2.modal.FuncionarioContratado;
import com.digitalhouse.aula2.service.PagamentoService;

public class CalculoSalarialContratado extends PagamentoService {
    @Override
    protected Double calcularSalario(Funcionario funcionario) {
        FuncionarioContratado contratado = ((FuncionarioContratado) funcionario);

        return contratado.getValorHora() * contratado.getNumHoras();
    }
}
