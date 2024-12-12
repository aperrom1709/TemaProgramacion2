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
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int aciertos=0;
        int a;
        int b;
        int suma;
      int resultado;
        do {
         a =  (int)(Math.random() * 100);
         b =  (int)(Math.random() * 100);
         suma=a+b;
            
         
            
            System.out.println("resuelva la suma: "+a+" + "+b);
            resultado=scan.nextInt();
            if (suma==resultado) {
                aciertos++;
            }
         
            
            
        } while (suma==resultado);
        System.out.println("acierto: "+aciertos);
    }
}
