
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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num;
        System.out.println("ingrese el tamaño del cuadrado");
        num=leer.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i==0 || i==num-1 || j==0 ||j==num-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                   
                
            }
            System.out.println();
        }
    }
    
}
    
    

