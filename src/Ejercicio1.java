
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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dado un número determine si es par o impar.
        Scanner var = new Scanner (System.in);
        int num, par;
        System.out.println("Ingrese un numero: ");
        num=var.nextInt();
        par = num%2;
        if (par==0) {
            System.out.println("Es par");
            
        }
        else{
            System.out.println("Es impar");
        }
   
                
                
    }
    
}
