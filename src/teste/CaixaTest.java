package teste;

import main.Caixa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaixaTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Caixa caixa = new Caixa();
        caixa.setDesconto(2);
        caixa.addItens(5);
        caixa.addItens(5);
        caixa.addItens(5);
        assertEquals(7.5, caixa.calcularItens());
    }
}