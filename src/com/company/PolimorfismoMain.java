package com.company;

public class PolimorfismoMain {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        CocheElectrico coche2 = new CocheElectrico();
        //creando objetos nuevos

        /*
         POLIMORFISMO nos permite iterar sobre una lista a pesar de que cada objeto sea de un tipo concreto,
        al podeer usar el tipo base, no spermite trabajar  tratandolos a todos por igual
         sin crear una estructura de datos diferente para cada tipo de coches diferente
         */

        Coche coche4 = new Coche();
        //

        if(coche2 instanceof CocheElectrico){
            System.out.println("coche electrico");
        }
        if (coche2 instanceof Coche){
            System.out.println("coche es coche");
        }


    }
}
