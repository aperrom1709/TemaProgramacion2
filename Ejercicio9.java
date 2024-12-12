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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        boolean siono;
        String respuesta1="si";
        String respuesta2="no";
        String respuestalluvia;
        String respuestadeberes;
        String biblioteca;
        System.out.println("Esta lloviendo?");
        respuestalluvia=scan.next();
        if (respuestalluvia.equals(respuesta1)) {
            System.out.println("Tienes que ir a la biblioteca?");
            biblioteca=scan.next();
            if (biblioteca.equals(respuesta2)) {
            System.out.println("NO PUEDE SALIR "+(siono=false));
          }else  if (biblioteca.equals(respuesta1)) {
            System.out.println((siono=true)+" puede salir");
          }
        }else  if (respuestalluvia.equals(respuesta2)) {
            System.out.println((siono=true)+" no llueve");
            System.out.println("Has hecho la tarea?");
            respuestadeberes=scan.next();
          if (respuestadeberes.equals(respuesta2)) {
            System.out.println("tarea no completada "+(siono=false));
          }else  if (respuestadeberes.equals(respuesta1)) {
            System.out.println((siono=true)+" tarea realizada");
            System.out.println("Tienes que ir a la biblioteca?");
            biblioteca=scan.next();
           if (biblioteca.equals(respuesta2)) {
            System.out.println("si puede salir "+(siono=true));
           }else  if (biblioteca.equals(respuesta1)) {
            System.out.println((siono=false)+"  no puede salir");
           }
          }
        }
    }
}
