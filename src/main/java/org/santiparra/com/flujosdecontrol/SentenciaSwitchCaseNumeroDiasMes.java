package org.santiparra.com.flujosdecontrol;

import java.util.Scanner;

public class SentenciaSwitchCaseNumeroDiasMes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero del mes de 1 - 12");
        int mes = scanner.nextInt();

        int numeroDias = 0;

        System.out.println("Ingrese un YYYY");
        int anio = scanner.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                numeroDias = 31;
                break;
            case 4, 6, 9, 11:
                numeroDias = 30;
                break;
            case 2:
                if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                System.out.println("El mes no existe!!");
        }
        System.out.println("numeroDias = " + numeroDias);
    }
}
