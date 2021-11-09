import model.Pessoa;
import server.IVacinacao;
import server.Impl.VacinacaoProxy;
import server.Impl.VacinacaoService;

import javax.swing.text.IconView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatoData.parse("14/10/2021");

        Pessoa pessoa = new Pessoa("Murilo", "Machado", "27138363", "H1N1", data);

        IVacinacao proxy = new VacinacaoProxy(new VacinacaoService());

        proxy.vacinar(pessoa);
    }
}
