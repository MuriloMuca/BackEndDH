package server.Impl;

import model.Pessoa;
import server.IVacinacao;

import java.util.Date;

public class VacinacaoProxy implements IVacinacao {

    private VacinacaoService vacinacaoService;

    public VacinacaoProxy(VacinacaoService vacinacaoService) {
        this.vacinacaoService = vacinacaoService;
    }


    @Override
    public void vacinar(Pessoa pessoa) {

        Date dataAtual = new Date();

        if(pessoa.getDataVacina().before(dataAtual)
                || pessoa.getDataVacina().equals(dataAtual)){vacinacaoService.vacinar(pessoa);
        } else {
            System.out.println("Sua vez ainda não chegou.");
        }
    }
}