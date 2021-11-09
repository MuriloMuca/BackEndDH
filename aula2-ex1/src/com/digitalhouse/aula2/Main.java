package com.digitalhouse.aula2;

import com.digitalhouse.aula2.modal.Funcionario;
import com.digitalhouse.aula2.modal.FuncionarioContratado;
import com.digitalhouse.aula2.modal.FuncionarioEfetivo;
import com.digitalhouse.aula2.modal.Tipo;
import com.digitalhouse.aula2.service.PagamentoService;
import com.digitalhouse.aula2.service.impl.CalculoSalarialContratado;
import com.digitalhouse.aula2.service.impl.CalculoSalarialEfetivo;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, PagamentoService> serviceMap = Map.of("Contratado", new CalculoSalarialContratado(), "Efetivo", new CalculoSalarialEfetivo());

        Funcionario efetivo = new FuncionarioEfetivo("Jose", "Silva", "0000125", Tipo.EFETIVO, 2400.35);
        Funcionario contratado = new FuncionarioContratado("Maria", "Souza", "0000241", Tipo.CONTRATADO, 176, 24.35);

        PagamentoService service = serviceMap.get("Efetivo");
        service.pagar(efetivo);

        service = serviceMap.get("Contratado");
        service.pagar(contratado);

    }
}
