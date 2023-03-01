package com.company;

public class CocheMain {
    public static void main(String[] args) {
        String coche = "alfa romeo";
        Coche cocheObj = new Coche();


        Coche cocheObj2 = new Coche("rojo", "honda", "civic");

        cocheObj2.acelerar(50);


        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "rojo";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "Civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("txs2", "Alfa", "Romeo");
        System.out.println(cocheElectrico2);

    }
}
