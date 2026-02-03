package edu.marinescudariusjoanito.endes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calc = new Calculadora();

    /**
     * Verifica que la suma funciona correctamente con valores normales.
     */
    @Test
    void testSumar() {
        assertEquals(9, calc.sumar(4, 5));
    }

    /**
     * Verifica que la resta devuelve el resultado esperado.
     */
    @Test
    void testRestar() {
        assertEquals(3, calc.restar(7, 4));
    }

    /**
     * Comprueba que la multiplicación funciona correctamente.
     */
    @Test
    void testMultiplicar() {
        assertEquals(20, calc.multiplicar(4, 5));
    }

    /**
     * Comprueba que la división devuelve el valor correcto.
     */
    @Test
    void testDividir() {
        assertEquals(2.5, calc.dividir(5, 2));
    }

    /**
     * Comprueba que dividir entre cero lanza la excepción adecuada.
     */
    @Test
    void testDividirEntreCero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    }

}