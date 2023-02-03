/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author Macarena
 */
public class Ej1TresTablas5Elem {
    
    /*Crea tres tablas de cinco elementos: la primera de enteros, la segunda de double y la
      tercera de booleanos. Intenta mostrarlas por pantalla.*/
    
    public static void main(String[] args) {
        
        //int num [] = new int [5]; /Esto ahora almacena 0, 0, 0, 0, 0
        int num [] = {1, 2, 3, 4, 5};
        //double dec [] = new double [5]; / Esto almacena 0,0; 0,0; 0,0; 0,0; 0,0
        double dec [] = {0.1, 0.2, 0.3, 0.4, 0.5};
        //boolean verdfalso [] = new boolean [5]; / Esto almacena false, false, false, false, false
        boolean verdfalso [] = {false, true, false, true, false};
        
        System.out.println(num);
        System.out.println(dec);
        System.out.println(verdfalso);
    }
    
}
