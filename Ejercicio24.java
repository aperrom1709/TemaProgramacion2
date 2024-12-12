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
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int edad;
        System.out.println("introduce la edad: ");
            edad=scan.nextInt();
        int max=edad;
        int min=edad;
        
        
        
        while (edad!=-1) {
            if (max<edad) {
                max=edad;
            }
            if (min>edad) {
                min=edad;
            }
            System.out.println("Otro numero");
            edad=scan.nextInt();
            
                
        }
        System.out.println("minimo: "+min+" , maximo: "+max);
    }
}
