/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package programacion.ut2;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-03
 */
public class Ejercicio52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        int n;
        System.out.println("introduzca el numero que quiera comprobar");
        n=scan.nextInt();
        
        
        if (esPrimo(n)) {
            
            System.out.println("El numero "+n+" es primo");
        }else   {
        
            System.out.println("El numero "+n+" no es primo");
        }
        
        
        
    }
    
     static boolean esPrimo(int n){
        
        boolean esPrimo=true;
        int i=2;
         if (n<2) {
             esPrimo=false;
         }
        
       
     
        while   (i<n && esPrimo){
            if (n%i==0) {
                esPrimo=false;
            }
            i++;
        }
    
        return esPrimo;
    }
}
