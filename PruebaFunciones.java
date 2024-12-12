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
public class PruebaFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n;
        int a,b;
        System.out.println(Funciones.calculardoble(5));
        System.out.println(Funciones.sumar(5));
        System.out.println(Funciones.parimpar(8));
        System.out.println("cuantos saludos quieres");
        n=scan.nextInt();
        Funciones.variosSaludos(n);
        System.out.println("escriba el numero");
        a=scan.nextInt();
        System.out.println("escriba el numero");
        b=scan.nextInt();
        Funciones.numeromayor(a,b );
    }

    
}
