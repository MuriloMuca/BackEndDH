import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FabricaTest {

    FabricaRoupa fabricaRoupa = new FabricaRoupa();
    Roupa roupa1 = fabricaRoupa.fabricarRoupa(TipoRoupa.CALCA, Tamanho.XL, true, true);
    Roupa roupa2 = fabricaRoupa.fabricarRoupa(TipoRoupa.CALCA, Tamanho.L, false, false);
    Roupa roupa3 = fabricaRoupa.fabricarRoupa(TipoRoupa.CALCA, Tamanho.M, false, true);
    Roupa roupa4 = fabricaRoupa.fabricarRoupa(TipoRoupa.CAMISA, Tamanho.XS, true, false);
    Roupa roupa5 = fabricaRoupa.fabricarRoupa(TipoRoupa.CAMISA, Tamanho.S, true, true);

    @Test
    void ProductionTest(){
        Assertions.assertEquals(TipoRoupa.CALCA, roupa1.getTipoRoupa());
        Assertions.assertEquals(Tamanho.XL, roupa1.getTamanho());
        Assertions.assertTrue(roupa1.geteNovo());
        Assertions.assertTrue(roupa1.getImportado());
    }


}
