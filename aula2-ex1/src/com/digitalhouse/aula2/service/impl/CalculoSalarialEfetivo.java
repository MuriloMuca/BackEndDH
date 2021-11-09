package com.digitalhouse.aula2.service.impl;

import com.digitalhouse.aula2.modal.Funcionario;
import com.digitalhouse.aula2.modal.FuncionarioEfetivo;
import com.digitalhouse.aula2.service.PagamentoService;

public class CalculoSalarialEfetivo extends PagamentoService {

    @Override
    protected Double calcularSalario(Funcionario funcionario) {
        FuncionarioEfetivo efetivo = ((FuncionarioEfetivo) funcionario);
        Double salario = efetivo.getSalarioBase(); //salario base
        salario = salario - (efetivo.getSalarioBase() * efetivo.getDesconto()/100); //salario - descontos
        salario += (salario * efetivo.getBeneficios()/100); // salario(com desconto) + beneficios

        return salario;
    }
}
