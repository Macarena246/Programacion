/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Random;

/**
 *
 * @author Macarena
 */
public class Ej4Tabla10Aleatorio {
    
    /*Crear una tabla de longitud 10 que se inicializará con números aleatorios
      comprendidos entre 1 y 100. Mostrar la suma de todos los números aleatorios
      que se guardan en la tabla.*/
    
    public static void main(String[] args) {
        
        int valores [] = new int [10];

        for (int i = 0; i < valores.length; i++){
            
            valores [i] = (int) (Math.random () * 100 + 1); 
        }
        
        int suma = 0;
        for (int valor: valores){
            suma += valor;
        }
        
        System.out.println("La suma de los números aleatorios es " + suma);
    }
    
}
