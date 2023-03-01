package com.company;
public class StringMain{


        public static void main (String [] args) {
            //La clase String
        /*
       Length()
        startsWith ("")
        endsWith (**)
        index0f ("")
        substring (1,5)
        trin()
        equals ()
        compareTo

         */
            String mensaje = " Hola mundo ";

            System.out.println(mensaje.length());
            String mensajeMAY = mensaje.toUpperCase();
            System.out.println(mensajeMAY);
            System.out.println(mensajeMAY.trim()); //TRIM elimina los espacios del mensaje
            mensajeMAY = mensajeMAY.trim();

            String otro = "HOLA MUNDO";
            if (mensaje.equals(otro)) {
                System.out.println("Verdadero!");
            }

        }

}