package org.santiparra.com.operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        /*Preincremento*/

        int i = 1;
        int j = ++i; //primero se incrementa y luego se asigna el valor a la variable

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        /*Postincremento*/

        i = 2;
        System.out.println("Inicial de i = " + i);
        j = i++; // primero se asigna el valor a la variable, luego se incrementa
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        /*Predecremento*/

        i = 3;
        j = --i; //primero se decrementa y luego se asigna el valor a la variable
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        /*Postdecremento*/

        i = 4;
        j = i--; // primero se asigna el valor a la variable, luego se decrementa
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);
    }
}
