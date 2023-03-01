package com.companyString;

public class TryCatchMain {
    public static void main(String[] args) {

        try {
            int result = 5 / 0;
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Cierre de recurso");
            //el codigo que este en finally siempre se ejecuta
        }
                /*
                TROWS en la asignatura del metodo indica que lanza una expecion y
                TROW  sin -s- lanza la excepción.
                 */


        System.out.println("Fin");
    }
}