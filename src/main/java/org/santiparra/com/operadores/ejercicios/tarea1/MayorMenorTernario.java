package org.santiparra.com.operadores.ejercicios.tarea1;

import java.util.Scanner;

public class MayorMenorTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int mayor;
        int mayor2;

        System.out.println("Ingreso un numero");
        num1 = scanner.nextInt();

        System.out.println("Ingrese segundo numero");
        num2 = scanner.nextInt();

        mayor = num1 > num2  ? num1 : num2;
        mayor2 = num2 > num1 ? num1 : num2;

        System.out.println("El orden de los nuemro de mayor a menor es el siguiente: " +mayor + "," + mayor2);
    }
}
