package com.digitalhouse.aula2.modal;

public class FuncionarioEfetivo extends Funcionario {

    private Double salarioBase;
    private Integer desconto = 14;
    private Integer beneficios = 5;

    public FuncionarioEfetivo(String nome, String sobrenome, String contaBancaria, Tipo tipo, Double salarioBase) {
        super(nome, sobrenome, contaBancaria, tipo);
        this.salarioBase = salarioBase;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public Integer getDesconto() {
        return desconto;
    }

    public Integer getBeneficios() {
        return beneficios;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
