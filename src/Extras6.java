
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
public class Extras6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Leer la altura de N personas y determinar el promedio de estaturas que
        //se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
        
        Scanner leer = new Scanner (System.in);
        int n,bajos=0,altos=0;
        double altura, totalbajos=0, totalaltos=0;
        altura=0.0;
        System.out.println("Ingrese la cantidad de personas: ");
        n=leer.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la altura de la persona N°"+(i+1));
            altura=leer.nextDouble();
            if (altura<1.6) {
                bajos++;
                totalbajos+=altura;
            } else {
                altos++;
                totalaltos+=altura;
            
        }
            
        }
          System.out.println("El promedio de las personas menores a 1.60 es de " + totalbajos/bajos+ "\n"+
          "En general la altura promedio es de "+(totalbajos+totalaltos)/(n));
    }
    
}
