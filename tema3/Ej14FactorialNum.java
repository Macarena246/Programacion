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
public class Ej14FactorialNum {
    
    /*Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se
denota 5! y es igual a 5x4x3x2x1 = 120.*/
    
    public static void main(String[] args) {
        
        Scanner num = new Scanner (System.in);
        
        int n;
        double factorial = 1;
        System.out.println("Introduzca el número del que quiere saber su factorial: ");
        n = num.nextInt();
        
        for (int i = n; i > 0; i--){
            
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + n + " es " + factorial);
    }
}
