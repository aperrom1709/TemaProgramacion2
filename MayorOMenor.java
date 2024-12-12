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
public class MayorOMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        
        int edad;
        boolean result;
        
        System.out.println("Introduzca la edad: ");
        edad=scan.nextInt();
        
        if (edad>=18) {
            result=true;
            System.out.println(""+result);
        }else if (edad<18) {
            result=false;
            System.out.println(""+result);
        }
 
         
               
    }
}
