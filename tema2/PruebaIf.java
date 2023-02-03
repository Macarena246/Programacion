/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;

/**
 *
 * @author Macarena
 */
public class PruebaIf {
    public static void main (String [] args){
    
        int a=11; //esta variable es global
        if (a + 1 < 10) {
            int b = 18; //esta variable es local
            a = 0;
            System.out.println("Hola");
        }
        System.out.println("El valor de a es: " + a);
       // System.out.println("El valor de b es: " +  b); //error
    }
}
