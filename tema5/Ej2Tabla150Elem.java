/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Arrays;

/**
 *
 * @author Macarena
 */
public class Ej2Tabla150Elem {
    
    /*Crear una tabla de 150 elementos. Mostrar cuántos elementos tiene esa tabla.
      Poner todos sus elementos a false.*/
    
    public static void main(String[] args) {
        
        boolean tabla [] = new boolean [150];
        System.out.println(tabla.length);
        Arrays.fill(tabla, false);
    }
    
}
