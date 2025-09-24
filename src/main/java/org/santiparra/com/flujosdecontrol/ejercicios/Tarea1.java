package org.santiparra.com.flujosdecontrol.ejercicios;

import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un total de x enteros!");
        int num = sc.nextInt();

        if (num < 10) {
            System.out.println("Error: Debe comparar al menos 10 números enteros!");
        } else {
            int menor = Integer.MAX_VALUE; // asignamos un valor máximo por defecto como numero menor para comenzar
            int numero;

            for (int i = 0; i < num; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                numero = sc.nextInt();
                menor = (numero < menor) ? numero : menor;
            }

            System.out.println("El número menor es: " + menor);

            if (menor < 10) {
                System.out.println("El número " + menor + " es menor que 10!");
            } else {
                System.out.println("El número " + menor + " es igual o mayor que 10!");
            }
        }
    }
}
