/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej14CalcularAelevadoN {
    
    /*Plantear una función que calcule a^n, donde a es real y n es un entero no
    negativo. Realizar una versión iterativa y otra recursiva.
    
    En primer lugar deberemos analizar cuál es la forma recursiva de dicha operación.*/
    
    
    //Forma iterativa:
    public static void main(String[] args) {
        
        
        Scanner numero = new Scanner (System.in);
        
        System.out.println("Introduzca el número y a cuánto lo quiere elevar: ");
        double a = numero.nextDouble();
        int n = numero.nextInt();
            
//        exponencialIter (a, n);
        
        System.out.println("El resultado es " + exponencialRecurs (a, n));
        
    }
    
    
    static double exponencialIter (double a, int n){
        
         double resultado = 0;
         
         for (double i = a; i > 0; i--){
            
            resultado = Math.pow(a, n);
            
        }
         return resultado;
    }
    
    
    
    //Forma recursiva:
     static double exponencialRecurs (double a, int n){
        
         double resultado;
         
         if (n == 0){
             resultado = 1;
         } else {
             
             resultado = a * exponencialRecurs(a, n - 1);
         }
         
         return resultado;
    }
    
}
