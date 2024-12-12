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
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int num;
        System.out.println("cuantas  veces quieres repetir la opcion");
        num=scan.nextInt();
        for (int i=num; i > 0; i--) {
            System.out.println("Eco");
        }
    }
}
