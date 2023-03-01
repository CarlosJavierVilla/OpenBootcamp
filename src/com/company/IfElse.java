package com.company;

public class IfElse {
    public static void main(String[] args) {

        boolean check = 5 < 10;

        int number1 = 5;
        int number2 = 10;
        int number3 = 20;
        int number4 = 30;

            if (number1 > number2 && number3 > number4) {
                System.out.println("1verdadero");
                System.out.println("2verdadero");
            }else if (number3 > number1) {
                System.out.println("30 es mayor que 5");
            }

    }

}
