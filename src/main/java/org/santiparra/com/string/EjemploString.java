package org.santiparra.com.string;

public class EjemploString {
    public static void main(String[] args) {
        /*

        ejemplos de comparacion de strings

        String curso = "programacion Java";
        String curso2 = new String("programacion Java");
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        //el metodo equals compara por valor!
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        //cuando se crea un objeto en la literal que tiene le mismo valor siempre va a dar true ya que apunta hacia la misma memoria
        String curso3 = "programacion Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
        */


        /*

        * Ejemplos de concatenacion simples

        String curso = "Programacion Java";
        String profesor = "Santi Parra";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        // los parentesis sirve para cambiar la procedencia de la operacion
        System.out.println(detalle + (numeroA + numeroB));

        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(" ").concat(profesor);
        System.out.println(detalle2);
        *
        */

        /*

        * Ejemplso String inmutable

        String curso = "Programacion Java";
        String profesor = "Santi Parra";

        String resultado = curso.concat(profesor);
        System.out.println(curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
        */

        /*

        * Ejemplo String test concat

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicial = System.currentTimeMillis();

        for (int i =0; i < 500; i++){
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms
            //c += a+b+"\n"; // 500 => 9ms
            sb.append(a) // 500 => 0ms
                    .append(b)
                    .append("\n");
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicial);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        */

        /*

        * Ejemplo de validar un String

        String curso = null;

        boolean esNull = curso == null;

        System.out.println("esNull = " + esNull);

        if(esNull) {
            curso = " ";//"Programacion Java";
        }
        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esVacio3 = curso.isBlank(); //es mas estricto que isEmpty ya que ese valida si es null y tambien valida si es disinto que empty y tambien mira si tiene contenido en blanco
        System.out.println("esVacio3 = " + esVacio3);

        if (esVacio3 == false) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
        */

        /*
        * String metodos

        String nombre = "Santi";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Santi\") = " + nombre.equals("Santi"));
        System.out.println("nombre.equals(\"Santi\") = " + nombre.equals("santi"));
        System.out.println("nombre.equalsIgnoreCase(\"santi\") = " + nombre.equalsIgnoreCase("santi"));
        System.out.println("nombre.compareTo(\"Santi\") = " + nombre.compareTo("Santi"));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4)); // el endIndex no se tomara!!

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); // el indeOf del String devuelve el indice del primer caracter que se encuentre!
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // lastIndexOf devuelve el indice del ultimo caracter que se encuentre!
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t")); // el contains devuelve true si el String contiene el parametro
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("    trabalenguas ");
        System.out.println("  trabalenguas ".trim());
        */

        /*

        * String extenciones de archivos

        String archivo = "alguna_iamgen.jpeg";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo = " + archivo.substring(i+1));
        */

        /*
        * String metodos array
        */

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length()); // el lenght en un string es un metodo!!
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] caracteres = trabalenguas.toCharArray();
        int largo = caracteres.length; // aqui el lenght en un arreglo es una propiedad!!
        System.out.println("largo = " + largo);
        for (int i = 0; i <largo; i++){
            System.out.print(caracteres[i]);
        }

        System.out.println("\ntrabalenguas = " + trabalenguas.split("a")); // el metodo split devuelve un arreglo de Strings!!

        String[] caracteres2 = trabalenguas.split("a");
        int largo2 = caracteres2.length;
        for(int j = 0; j < largo2; j++){
            System.out.println(caracteres2[j]);
        }

        String archivo = "alguna.imagen.jpeg";
        String[] archivoarr = archivo.split("\\."); // con el \\ o []  convertiria el . en un caracter!!
        int largo3 = archivoarr.length;
        for(int k = 0; k < largo3; k++){
            System.out.println(archivoarr[k]);
        }
        System.out.println("Extencion = " + archivoarr[largo3 -1]);
    }
}
