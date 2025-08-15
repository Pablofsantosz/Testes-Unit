import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

package testes.unit;


// Supondo que exista uma classe Calculadora com métodos básicos
public class CalculadoratestTest {

    @Test
    void testSoma() {
        Calculadoratest calc = new Calculadoratest();
        assertEquals(5, calc.soma(2, 3));
        assertEquals(0, calc.soma(-2, 2));
        assertEquals(-5, calc.soma(-2, -3));
    }

    @Test
    void testSubtrai() {
        Calculadoratest calc = new Calculadoratest();
        assertEquals(-1, calc.subtrai(2, 3));
        assertEquals(-4, calc.subtrai(-2, 2));
        assertEquals(1, calc.subtrai(-2, -3));
    }

    @Test
    void testMultiplica() {
        Calculadoratest calc = new Calculadoratest();
        assertEquals(6, calc.multiplica(2, 3));
        assertEquals(-4, calc.multiplica(-2, 2));
        assertEquals(6, calc.multiplica(-2, -3));
        assertEquals(0, calc.multiplica(0, 5));
    }

    @Test
    void testDivide() {
        Calculadoratest calc = new Calculadoratest();
        assertEquals(2, calc.divide(6, 3));
        assertEquals(-1, calc.divide(-2, 2));
        assertEquals(2, calc.divide(-6, -3));
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
}