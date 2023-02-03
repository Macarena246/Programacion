/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej1Pares0a50 {

    /*Crear una aplicación que muestre los números pares de 0 a 50.*/
   
    
    public static void main(String[] args) {

        int numero = 0; 
        while (numero >= 0 && numero <= 50) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
