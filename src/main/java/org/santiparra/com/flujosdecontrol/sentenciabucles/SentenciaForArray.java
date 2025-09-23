package org.santiparra.com.flujosdecontrol.sentenciabucles;

import javax.swing.*;

public class SentenciaForArray {
    public static void main(String[] args) {

        String[] nombres = {"Andres","Pepe","Maria","Paco","Lalo","Bea","Pato","Pepa"};
        int count = nombres.length;

        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase("andres") ||
                nombres[i].equalsIgnoreCase("pepa")) { // esto es para quitar andres y pepa
                continue;
            }
            System.out.println("nombres[i] = " + nombres[i]);
        }

        /*Para buscar un nombre*/

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");
        }
    }
}
