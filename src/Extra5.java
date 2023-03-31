
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yesica Rocio Gill
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Una obra social tiene tres clases de socios:
        //Los socios tipo ‘A’ abonan una cuota mayor, 
        //pero tienen un 50% de descuento en todos los tipos de tratamientos.
        
        //Los socios tipo ‘B’ abonan una cuota moderada y tienen 
        //un 35% de descuento para los mismos tratamientos que 
        //los socios del tipo A.
        

        //Los socios que menos aportan, los de tipo ‘C’, no reciben    
        //descuentos sobre dichos tratamientos.
        
        //Solicite una letra (carácter) que representa la clase de un 
        //socio, y luego un valor real que represente el costo del tratamiento 
        //(previo al descuento) y determine el importe en efectivo a pagar por 
        //dicho socio.
// TODO code application logic here
        /**
         * Una obra social tiene tres clases de socios: Los socios tipo ‘A’
         * abonan una cuota mayor, pero tienen un 50% de descuento en todos los
         * tipos de tratamientos. Los socios tipo ‘B’ abonan una cuota moderada
         * y tienen un 35% de descuento para los mismos tratamientos que los
         * socios del tipo A. Los socios que menos aportan, los de tipo ‘C’, no
         * reciben descuentos sobre dichos tratamientos. Solicite una letra
         * (carácter) que representa la clase de un socio, y luego un valor real
         * que represente el costo del tratamiento (previo al descuento) y
         * determine el importe en efectivo a pagar por dicho socio.
        *
         */

        Scanner leer = new Scanner(System.in);

        String letra;
        Double costo, costosocio;

        do {
            System.out.println("ingrese que tipo de socio es");
            letra = leer.next();
            //letra = leer.nextLine().substring(0, 1);
            letra = letra.toUpperCase();
            if (!letra.equals("A") && !letra.equals("B") && !letra.equals("C")) {
                System.out.println("No existe la categoria de socio, por favor ingrese una correcta");                
            }
        } while (!letra.equalsIgnoreCase("A") && !letra.equals("B") && !letra.equals("C"));

        System.out.println("ingrese el costo del tratamiento");
        costo = leer.nextDouble();

        switch (letra) {
            case "A":
                costosocio = costo * 0.5;
                System.out.println("El costo que debera abonar el socio es: $" + costosocio);
                break;
            case "B":
                costosocio = costo * 0.65;
                System.out.println("El costo que debera abonar el socio es: $" + costosocio);
                break;
            case "C":
                costosocio = costo;
                System.out.println("El costo que debera abonar el socio es: $" + costosocio);
                break;
        }
        
    }

    
    
}
