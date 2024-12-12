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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int nota;
        System.out.println("Escribela nota");
        nota=scan.nextInt();
        String notaExamen = switch (nota){
            case 0,1,2,3,4 -> "insuficiente";
            case 5 -> "sufi";
            case 6 -> "bien";
            case 7,8 -> "notable";
            case 9,10 -> " sobresaliente";
            default ->"numero invalido";
        };
        System.out.println("La nota es: "+notaExamen);
    
    }
}
