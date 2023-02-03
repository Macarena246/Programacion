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
public class Ej12SumaImpares {

    /*Diseñar un programa que muestre la suma de los 10 primeros números impares.*/
    
    
    public static void main(String[] args) {

        int suma = 0;
        for (int i = 1; i < 20; i += 2) {
            suma = suma + i;
        }
        System.out.println(suma);
    }
}
