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
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("introduce el numero que quieres comprobar");
        n=scan.nextInt();
        if (n%2==0) {
            System.out.println("es par");
        }else{
            System.out.println("no es par");
        }
           
        
    }
}
