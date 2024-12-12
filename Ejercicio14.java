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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
                int primerTrimestre;
        int segundoTrimestre;
        int tercerTrimestre;
        int notaFinal;
        double notaExpediente;
        System.out.print("Escribe la nota final del 1º Trimestre: ");
        primerTrimestre = scan.nextInt();
        System.out.print("Escribe la nota final del 2º Trimestre: ");
        segundoTrimestre = scan.nextInt();
        System.out.print("Escribe la nota final del 3º Trimestre: ");
        tercerTrimestre = scan.nextInt();
        notaExpediente = (primerTrimestre + segundoTrimestre + tercerTrimestre / 3f);
        notaFinal = (int)notaExpediente;
        System.out.println("Nota boletin: " + notaFinal );
        
        System.out.println("Nota Expediente academico " + notaExpediente);
        
    }
}
