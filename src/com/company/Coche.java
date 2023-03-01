package com.company;

public class Coche {
    //atributos->caracteristicas de un coche y que varia de un coche a otro
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    //contructores
    public Coche(){

    }
    public Coche(String color, String fabricante, String modelo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    //comportamiento
    public void acelerar(Integer cantidad){
        if(cantidad > 0 && cantidad <= 120)
        this.velocidad += cantidad;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
