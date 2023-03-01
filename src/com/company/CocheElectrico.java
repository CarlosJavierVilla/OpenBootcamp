package com.company;

//extendes nos permite extender a otra clase, heredar ese codigo y extender con mas cosas
public class CocheElectrico extends Coche {
    String motorElectrico; //atributo

    public CocheElectrico(){
    }
    public CocheElectrico(String motorElectrico){
        this.motorElectrico=motorElectrico;
    }
    public CocheElectrico(String color, String fabricante, String modelo){   //constructor
        super(color, fabricante, modelo); //super para utilizar el constructor de la clase superior
        this.motorElectrico = motorElectrico;


    /*
    /  TRA MANERA DE HACER EL CONSTRUCTOR
     public ElectricCar(String motorElectrico)
     {this.motorElectrico=motorElectrico}
     */

    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
