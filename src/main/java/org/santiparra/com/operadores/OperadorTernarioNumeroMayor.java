package org.santiparra.com.operadores;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = 0;

        System.out.println("Ingresa un numero");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa un segundo numero");
        int num2 = scanner.nextInt();

        System.out.println("Ingresa un tercer numero");
        int num3 = scanner.nextInt();

        System.out.println("Ingresa un cuarto numero");
        int num4 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("El numero mayor es: " + max);
        scanner.close();
    }
}
