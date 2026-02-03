package edu.marinescudariusjoanito.endes;

public class ConversorTemperatura {

    /**
     * Conversor de Celsius a Fahrenheit
     * @param celsius Temperatura a convertir
     * @return Grados en fahrenheit
     */
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    /**
     * Conversor de Fahrenheit a Celsius
     * @param fahrenheit Temperatura a convertir
     * @return Grados en celsius
     */
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }



}
