/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion.ut2;

import java.util.Scanner;

/**
 *
 * @author 1DAW2425-03
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        int num;
        num=scan.nextInt();
        int valorAbsoluto;
        valorAbsoluto=Math.abs(num);
        //valorabsoluto=num>0?
        System.out.println("valor absoluto= " +valorAbsoluto);
    }
    
}
