
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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int correcto=0,incorrecto=0;
        
        do{
            System.out.println("Ingrese una palabra con el formato X...O");
            cadena=leer.nextLine();
            if (cadena.length()<=5 && cadena.substring(0,1).equals("X") && cadena.substring(4,5).equals("O" )){
                correcto++;
                System.out.println("La secuencia es correcta");
                
            }else {
                incorrecto++;
                System.out.println("La secuencia es incorrecta");
            }
              
        }while(!cadena.equals("&&&&&"));
        
        System.out.println("Ha ingresado correctamente " + correcto + " veces, e incorrectamente " + incorrecto + " veces");
        
        
        
    }
    
}
    
