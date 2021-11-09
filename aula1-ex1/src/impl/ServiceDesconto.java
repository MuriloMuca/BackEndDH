package impl;

import exapi.ApiCartao;
import exapi.ApiProduto;
import exapi.ApiQuantidade;
import interfac.IDesconto;
import modal.Cartao;
import modal.Produto;

public class ServiceDesconto implements IDesconto {

    private ApiCartao apicartao = new ApiCartao();
    private ApiProduto apiproduto = new ApiProduto();
    private ApiQuantidade apiquantidade = new ApiQuantidade();



    @Override
    public Double calcularDesconto(Cartao cartao, Produto produto, Integer quantidade) {

        Double desconto = 0.00;

        desconto = desconto + apicartao.checkDesconto(cartao.getBanco());
        desconto += apiproduto.checkDesconto(produto.getTipo());
        desconto += apiquantidade.checkDesconto(quantidade);

        return desconto;
    }
}
