package org.santiparra.com.operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String variable = 7 == 7 ? "si es verdadero" : "es falso!";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        System.out.println("Ingrese la nota de matematicas: ");
        matematicas = scanner.nextDouble();

        System.out.println("Ingrese la nota de ciencias: ");
        ciencias = scanner.nextDouble();

        System.out.println("Ingrese la nota de historia: ");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "aprobado":"rechazado";
        System.out.println("estado = " + estado);

        scanner.close();
    }
}
