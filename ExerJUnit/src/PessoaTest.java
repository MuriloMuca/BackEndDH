import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    Pessoa pessoa;
    Pessoa pessoa1;
    Pessoa pessoa2;

    @BeforeEach
    void doBefore(){
        pessoa = new Pessoa("Murilo","Machado");
        pessoa.setIdade(LocalDate.of(1980,06,14));
        pessoa1 = new Pessoa("Helena","Martinez");
        pessoa.setIdade(LocalDate.of(1990,11,12));
        pessoa2 = new Pessoa("Wheslley","Rimar");
        pessoa.setIdade(LocalDate.of(1990,06,23));
    }

    @Test
    void getNomeCompleto(){
        assertEquals("Murilo Machado", pessoa.calcularNomeCompleto());
    }

    @Test
    void getEMaiorOuIgualA18(){
        assertEquals(pessoa.eMaiorDeIdade(), true);
    }
}