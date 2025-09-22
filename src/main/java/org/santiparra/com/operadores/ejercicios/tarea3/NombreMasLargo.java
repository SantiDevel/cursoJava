package org.santiparra.com.operadores.ejercicios.tarea3;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {

        String nombre1;
        String nombre2;
        String nombre3;

        String nombreMasLargo = "";

        nombre1 = JOptionPane.showInputDialog("Ingrese su nombre completo");
        nombre2 = JOptionPane.showInputDialog("Ingrese un segundo nombre completo");
        nombre3 = JOptionPane.showInputDialog("Ingrese un tercer nombre completo");

        nombreMasLargo = nombre1.length() > nombre2.length() ? nombre1 : nombre2;
        nombreMasLargo = nombreMasLargo.length() > nombre3.length() ? nombreMasLargo : nombre3;

        System.out.println(nombreMasLargo + " tiene el nombre mas largo");
    }
}
