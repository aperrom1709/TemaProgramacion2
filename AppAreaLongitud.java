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
public class AppAreaLongitud {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        double radio;
        final double PI=3.14;
        double longitud;
        double area;
        System.out.println("introduce el radio: ");
        radio=scan.nextDouble();
        longitud=2*PI*radio;
        System.out.println("La longitud es: "+longitud);
        area=PI*radio*2;
        System.out.println("El area es: "+area);
        
        
        
    }
}
