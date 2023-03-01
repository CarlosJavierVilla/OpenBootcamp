package com.example.interfaces;

import com.company.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();

        /*
        Implementacion de Clase la cual tiene un metodo crearCoche
         */

        Coche coche1 = service1.crearCocheDemo();
        Coche coche2 = service2.crearCocheDemo();
    }

}