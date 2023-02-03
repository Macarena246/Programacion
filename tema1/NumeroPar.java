/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class NumeroPar {
    
    /*Escribir un programa que pida un número al usuario e indique mediante un literal
    booleano si el número es par.*/
    
     public static void main (String [] args) {
     
         System.out.println ("Introduzca un número: ");
          Scanner sc = new Scanner(System.in);
           double numero=sc.nextDouble();
           boolean truefalse = numero %2==0;
          
          System.out.println(truefalse);
         
     }
}
