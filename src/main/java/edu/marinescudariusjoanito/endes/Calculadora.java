package edu.marinescudariusjoanito.endes;

public class Calculadora {


    /**
     * Suma de dos numeros
     * @param a primer numero a sumar
     * @param b segundo numero a sumar
     * @return suma de los numeros
     */
    public int sumar (int a , int b){
        return a+b;
    }


    /**
     * Resta de dos numeros
     * @param a primer numero a restar
     * @param b segundo numero a restar
     * @return resta de los numeros
     */

    public int restar (int a , int b){
        return a-b;
    }

    /**
     * multiplicación de dos numeros
     * @param a primer numero a multplicar
     * @param b segundo numero a multiplicar
     * @return multiplicacion de los numeros
     */

    public int multiplicar (int a , int b){
        return a*b;
    }


    /**
     * Division de dos numeros
     * @param a divindendo
     * @param b divisor
     * @return resutltado de la division
     * @throws IllegalArgumentException si el divisor es 0
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }
}
