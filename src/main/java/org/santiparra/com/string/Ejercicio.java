package org.santiparra.com.string;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el nombre de tu familiar o amigo!");
        String nombre = scanner.nextLine();
        String nombreA = nombre.toUpperCase().charAt(1) + "." + nombre.substring(nombre.length() -2);

        System.out.println("Dime el nombre de tu familiar o amigo!");
        String nombreb = scanner.nextLine();
        String nombreB = nombreb.toUpperCase().charAt(1) + "." + nombreb.substring(nombre.length() -2);

        System.out.println("Dime el nombre de tu familiar o amigo!");
        String nombrec = scanner.nextLine();
        String nombreC = nombrec.toUpperCase().charAt(1) + "." + nombrec.substring(nombre.length() -2);

        String resultado = nombreA + "_" + nombreB + "_" + nombreC;

        System.out.println(resultado);
        scanner.close();
    }
}
