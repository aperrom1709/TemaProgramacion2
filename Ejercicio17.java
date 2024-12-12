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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Scanner scan=new Scanner(System.in);
       int n;
       int r;
        System.out.println("introduce el primer numero");
        n=scan.nextInt();
        System.out.println("introduce el segundo numero");
       r=scan.nextInt();
        if (n==r) {
            System.out.println("son iguales");             
        }else  {
            System.out.println("no son iguales");
              if (n<r) {
                 System.out.println("el numero "+r+" es mas grande");
            }else{
                 System.out.println("el numero "+n+" es mas grande");
             }
        }   
    }
}
