package org.santiparra.com.operadores;

import java.util.Scanner;

public class OperadorLogicosLogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] usernames = {"santi","admin"};
        String[] passwords = {"12345","12345"};

        System.out.println("Ingrese el username");
        String usernameIngresado = sc.nextLine();

        System.out.println("Ingrese la password");
        String passwordIngresada = sc.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){
            if ((usernames[i].equalsIgnoreCase(usernameIngresado) && passwords[i].equalsIgnoreCase(passwordIngresada))){
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado) {
            System.out.println("Bienvenido user: ".concat(usernameIngresado));
        }else {
            System.out.println("Username o password erroneas!!");
            System.out.println("autenticacion erronea!!");
        }
    }
}
