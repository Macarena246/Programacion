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
public class Ej14Aumento25PorCiento {
    
    /*Crea una tabla de 6 elementos rellena de números decimales.
    Aumentar cada uno de esos elementos en un 25%.*/
    
    static void decimales (double tabla[]){
        
        for(int i = 0; i < tabla.length; i++){
            
            tabla [i] = tabla [i] * 1.25;
          
        }
        
    }
    
    
    public static void main(String[] args) {
        
        double valores [] = {4, 8, 6, 12, 3, 10};
        System.out.println(Arrays.toString(valores));
        decimales (valores);   
         System.out.println(Arrays.toString(valores));
    }
    
}
