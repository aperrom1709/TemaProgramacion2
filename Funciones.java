/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package programacion.ut2;


/**
 *
 * @author 1DAW2425-03
 */
public class Funciones {
         
        
        public static int calculardoble ( int numero){
           return numero*2;
        }
        public static int sumar(int numero){
           return numero + numero;
        }
        public static int parimpar(int numero){
            if (numero%2==0) {
              System.out.println("es par");
            }else{
              System.out.println("no es par");
            }
             return numero;
        }
        public static void variosSaludos(int n){
            
            for (int i = 0; i < n; i++) {
                System.out.println("hola");
            }
            
        }
        public static void numeromayor(int a,int b){
            if (a<b) {
                System.out.println(b+" es mayor que "+a);
               
            }else if (b<a) {
                System.out.println(a+" es mayor que "+b);
                
            }
           
        }
        

   
}
