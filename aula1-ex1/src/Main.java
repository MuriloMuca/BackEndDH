import impl.ServiceDesconto;
import modal.Cartao;
import modal.Produto;

public class Main {

    public static void main(String[] args) {
        Cartao cartao = new Cartao("0000111122224444",  "Itau");
        Produto produto = new Produto("leite", "caixinha");

        ServiceDesconto service = new ServiceDesconto();

        System.out.println(service.calcularDesconto(cartao, produto, 13));
    }
}
