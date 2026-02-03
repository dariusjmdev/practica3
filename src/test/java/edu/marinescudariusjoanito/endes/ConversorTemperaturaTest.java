package edu.marinescudariusjoanito.endes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversorTemperaturaTest {

    ConversorTemperatura conv = new ConversorTemperatura();
    /**
     * Comprueba la conversión de Celsius a Fahrenheit con valores estándar.
     */
    @Test
    void testCelsiusAFahrenheit() {
        assertEquals(32, conv.celsiusAFahrenheit(0));
        assertEquals(212, conv.celsiusAFahrenheit(100));
    }

    /**
     * Comprueba la conversión de Fahrenheit a Celsius con valores estándar.
     */
    @Test
    void testFahrenheitACelsius() {
        assertEquals(0, conv.fahrenheitACelsius(32));
        assertEquals(100, conv.fahrenheitACelsius(212));
    }


}