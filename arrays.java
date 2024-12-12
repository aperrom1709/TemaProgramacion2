/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package programacion.ut2;

import java.util.Arrays;

/**
 *
 * @author 1DAW2425-03
 */
public class arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        // TODO code application logic here
        
        int [] num={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(num));
        }
        System.out.println(num.length);
        
        String[][] nombres = new String[2][2];
        nombres[0][0] = "Arturo"; 
        nombres[0][1]="pirri";
        for (int i = 0; i < 1; i++) {
            System.out.println();
            for (int j = 0; j < 1; j++) {
                System.out.println(j);
            }
        }
    }
}
