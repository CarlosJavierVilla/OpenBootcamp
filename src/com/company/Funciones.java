package com.company;

public class Funciones {

    public static void main(String[] args) {
        
        holaMundo();
        holaMundo("Javier");


        //String hola = devolverHola();
        //System.out.println(hola);

        //System.out.println("Hola Mundo");
        //System.out.println("Hola Mundo");
    }



    private static String devolverHola() {

        return ("Hola mi gente developer");
    }

    public static void holaMundo() {
        System.out.println("Hola");

    }

    public static void holaMundo(String name) {
        System.out.println("El ganador es" + name);
    }

}
