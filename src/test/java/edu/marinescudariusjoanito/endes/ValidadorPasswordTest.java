package edu.marinescudariusjoanito.endes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorPasswordTest {

    ValidadorPassword validador = new ValidadorPassword();

    /**
     * Verifica que una contraseña válida cumple todas las reglas establecidas.
     */
    @Test
    void testPasswordValida() {
        assertTrue(validador.validar("Abcdef12"));
    }

    /**
     * Comprueba que una contraseña sin mayúsculas es rechazada.
     */
    @Test
    void testPasswordSinMayusculas() {
        assertFalse(validador.validar("abcdef12"));
    }

    /**
     * Comprueba que una contraseña sin números no es válida.
     */
    @Test
    void testPasswordSinNumeros() {
        assertFalse(validador.validar("Abcdefgh"));
    }

    /**
     * Verifica que una contraseña demasiado corta es rechazada.
     */
    @Test
    void testPasswordCorta() {
        assertFalse(validador.validar("Ab12"));
    }

    /**
     * Comprueba que el método devuelve false cuando la contraseña es nula.
     */
    @Test
    void testPasswordNula() {
        assertFalse(validador.validar(null));
    }

}