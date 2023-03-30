
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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor límite positivo,
        //y a continuación solicite números al usuario hasta que la suma de 
        //los números introducidos supere el límite inicial.
        Scanner var =new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        int num=0,sum=0, num1=0;
        num=var.nextInt();
        do {
            System.out.println("Ingrese otro numero: ");
                    num1=var.nextInt();
                    sum=sum+num1;
        }
         while(sum<num);       
    }
    
}
