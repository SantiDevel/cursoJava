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
        */

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
    }
}
