/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej6Mostrar5Nums {
    
    /*Diseñar un programa que solicite al usuario que introduzca por teclado 5 números
      decimales. A continuación, mostrar los números en el mismo orden que se han introducido.*/
    
    public static void main(String[] args) {
        
        Scanner numero = new Scanner (System.in);
        int valores [] = new int [5];
        
        for (int i = 0; i < 5; i++){
            System.out.println("Introduce un número decimal: ");
            int n;
            n = numero.nextInt();
            valores [i] = n;
            
        }
        
        System.out.println(Arrays.toString(valores));
    }
    
}
