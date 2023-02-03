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
public class Ej8Primitiva {
    
    /*Definir una función que tome como parámetros dos tablas, la primera con
    los 6 números de una apuesta de la primitiva, y la segunda (ordenada) con
    los 6 números de la combinación ganadora. La función devolverá el
    número de aciertos.*/
    
    static int primitiva (int apuesta[], int ganadora[]){
        int aciertos = 0;
        for (int a : apuesta) {
            if (Arrays.binarySearch (ganadora, a) >= 0){
                aciertos++; 
            }
        }
        return aciertos;
    }
    public static void main(String[] args) {
        
        int apuesta [] = {3, 13, 25, 33, 41, 48};
        int ganadora [] = {3, 25, 41, 42, 45, 49};
        
        System.out.println("Aciertos: " + primitiva(apuesta, ganadora));
    }
    
}
