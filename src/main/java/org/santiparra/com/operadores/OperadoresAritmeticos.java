package org.santiparra.com.operadores;

import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        /*Suma*/

        int i = 5, j= 4;

        int suma = i + j;

        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j)); // con el parentesis cambiamos la preferencia de operacion!!!

        /*Resta*/

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i - j)); //aqui nos da error por que el string no reconoce el operador -, por lo cual si o si debemos poner ().

        /*Multiplicacion*/

        int multi = i * j;
        System.out.println("multi = " + multi);

        /*Division*/

        int div = i / j;
        float div2 = (float) i / j; //Aqui forzamos el tipo integer a un tipo float!
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        /*Resto*/

        int resto = i % j;
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }
    }
}
