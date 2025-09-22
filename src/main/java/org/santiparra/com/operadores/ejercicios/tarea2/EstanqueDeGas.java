package org.santiparra.com.operadores.ejercicios.tarea2;

import java.util.Scanner;

public class EstanqueDeGas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String capacidad = "";
        double litros = 0.0;

        System.out.println("Ingrese la capacidad acutal de gasolina que tiene!");
        litros = scanner.nextDouble();

        capacidad = litros >= 1.0 && litros < 20.0 ? "insuficiente" : "";
        System.out.println("La capacidad es: " + capacidad);

        capacidad = litros >= 20.0 && litros < 35.0 ? "Suficiente" : "";
        System.out.println("La capacidad es: " + capacidad);

        capacidad = litros >= 35 && litros < 40 ? "Medio Estanque" : "";
        System.out.println("La capacidad es: " + capacidad);

        capacidad = litros >= 40 && litros < 60 ? "Estanque 3/4" : "";
        System.out.println("La capacidad es: " + capacidad);

        capacidad = litros >= 60 && litros < 70 ? "Estanque casi lleno" : "";
        System.out.println("La capacidad es: " + capacidad);

        capacidad = litros >= 70 ? "Estanque lleno" : "";
        System.out.println("La capacidad es: " + capacidad);
    }
}
