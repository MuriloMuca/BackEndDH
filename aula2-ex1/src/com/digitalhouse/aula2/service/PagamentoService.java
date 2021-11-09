package com.digitalhouse.aula2.service;

import com.digitalhouse.aula2.modal.Funcionario;
import com.digitalhouse.aula2.modal.Tipo;

import java.text.DecimalFormat;

public abstract class PagamentoService {

    public void pagar(Funcionario funcionario){

        funcionario.setSalarioFinal(calcularSalario(funcionario));
        Double salario = funcionario.getSalarioFinal(); // formatação do salário com duas casas decimais
        //DecimalFormat formato = new DecimalFormat("#.##");
        //salario = Double.valueOf(formato.format(salario));

        String resultado = String.format("%.2f", funcionario.getSalarioFinal());
        System.out.println(resultado);

        System.out.println(depositarSalario(funcionario.getContaBancaria(), resultado));
        System.out.println(emitirComprovante(funcionario.getTipo()));
    }

    public String depositarSalario(String conta, String salarioFinal){
        return "Deposito do Salario " + salarioFinal + " efetuado na conta " + conta;
    }

    public String emitirComprovante(Tipo tipo){
        if(tipo == Tipo.CONTRATADO){
            return "Recibo enviado por e-mail!";
        } else if (tipo == Tipo.EFETIVO ){
            return "Recibo impresso com sucesso!";
        }

        return "Erro ao emitir o recibo";
    }

    protected abstract Double calcularSalario(Funcionario funcionario);


}
