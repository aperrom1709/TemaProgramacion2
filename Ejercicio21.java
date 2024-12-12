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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int mes;
        System.out.println("Escribela nota");
        mes=scan.nextInt();
        String dias = switch (mes){
            case 1 -> "31 dias";
            case 2 -> "28 dias";
            case 3 -> "31 dias";
            case 4 -> "30 dias";
            case 6 ->  "31 dias";
            case 7 ->  "31 dias";
            case 8 ->  "31 dias";
            case 9 ->  "30 dias";
            case 10->  "31 dias";
            case 11->  "31 dias";
            case 12->  "31 dias";
            default  ->"mes no valido";
            
        };
        System.out.println("Los dias que tiene el mes son: "+dias);
    }
}
