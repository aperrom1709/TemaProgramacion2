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
public class AnioActu {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int num;
        int num2;
        System.out.println("introduzca año  actual: ");
        num=scan.nextInt();
        System.out.println("Año nacimiento: ");
        num2=scan.nextInt();
        int operacion;
        operacion=num-num2;
        System.out.println("Su edad es: "+ operacion);
    }
}
