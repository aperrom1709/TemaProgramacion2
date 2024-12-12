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
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int num=1;
        int cuadrao;
        
        
        
        while (num!=0) {
            System.out.println("introduce el numero: ");
            num=scan.nextInt();
            
            if (num!=0) {
                if (num%2==0) {
             System.out.println("es par"); 
            }else{
             System.out.println("no es par");
            } 
            
            if (num>0) {
               System.out.println("es positivo");
            }else   {
               System.out.println("es negativo");
            }
            cuadrao=num*2;
            System.out.println("el cuadrado del numero es: "+cuadrao);
            }
            
                
        }
    }
}
