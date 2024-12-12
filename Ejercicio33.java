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
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.println("escriba el numero");
        a=scan.nextInt();
        System.out.println("escriba el numero");
        b=scan.nextInt();
        System.out.println("escriba el numero");
        c=scan.nextInt();
        numeromayor(a, b, c);
    }
    
    
     public static void numeromayor(int a,int b){
            if (a<b) {
                System.out.println(b+" es mayor que "+a);
               
            }else if (b<a) {
                System.out.println(a+" es mayor que "+b);
                
            }
           
        }
        public static int numeromayor(int a,int b,int c){
            if (a>b && a>c) {
                return a;
            }else if (b>a && b>c) {
                return b;
            }
            return c;
            
        }
}
