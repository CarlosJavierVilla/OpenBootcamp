package com.companyString;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {


        /*
        con System.in ---> Se lee
        con System.out --> Se escribe
         */
       Scanner scanner = new Scanner(System.in);
       System.out.println("Introduce un nombre");
       String nombre = scanner.nextLine();
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        System.out.println("El nombre introdducido es" + nombre);
        System.out.println("El numero introducido es" + numero);

        System.out.println("Hola mundo");



    }
}
