package JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void retornarZero(){
        Calculadora calc = new Calculadora();
        double soma = calc.sum();
        Assertions.assertEquals(0,soma);

    }
    @Test
    public void retornarSoma(){
        Calculadora calc = new Calculadora();
        double soma = calc.sum(3,6,9);

        Assertions.assertEquals(18, soma);
    }

}

