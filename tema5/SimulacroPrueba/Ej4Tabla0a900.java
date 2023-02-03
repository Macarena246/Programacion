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
public class Ej4Tabla0a900 {
    
    /*Crear una tabla que contenga todos los números del 0 al 900 y mostrarla.*/
    
    static void numeros (){
        
        int t [] = new int [900];
        for (int i = 0; i < 900; i++) {
            t [i] = i;
        }
        System.out.println(Arrays.toString(t));
    }
    
    public static void main(String[] args) {
        numeros();
    }
}
