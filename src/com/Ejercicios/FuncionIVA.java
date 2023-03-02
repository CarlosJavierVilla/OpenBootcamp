package com.Ejercicios;

public class FuncionIVA {

    public static double calcularPrecioConIVA(double precio) {
        double iva = 0.14;
        double precioConIVA = precio * (1 + iva);
        return precioConIVA;
    }

    public static void main(String[] args) {

        double precio = 100;
        double precioConIVA = calcularPrecioConIVA(precio);
        System.out.println("Precio con IVA: " + precioConIVA + "€");
    }

}
