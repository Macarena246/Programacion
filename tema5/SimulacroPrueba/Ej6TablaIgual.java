/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.SimulacroPrueba;

import java.util.Arrays;

/**
 *
 * @author Macarena
 */
public class Ej6TablaIgual {
    
    /*Crear una función a la que se le pase una tabla y devuelva otra igual, pero
    con un elemento más (que también se le pasa como parámetro)*/
    
    static int [] tablaIgual (int tabla[], int n){

        int[] vacia = new int[tabla.length + 1];
        for (int i = 0; i < tabla.length; i++) {

            vacia[i] = tabla[i];
        }

        vacia[tabla.length] = n;

        return vacia;
    
    }
    
    
    public static void main(String[] args) {
        
        int tabla [] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(tablaIgual(tabla, 4)));
        
    }
}
