/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package programacion.ut2;

/**
 *
 * @author 1DAW2425-03
 */
public class brek {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int i = 1;
        while (i <= 10) {
            System.out.println("La i vale " + i);
            if (i == 2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        while (i2 < 10) {
            i2++;
            if (i2 % 2 == 0) {
                continue;
            }
            System.out.println("La i vale " + i2);
        }
    }
}
