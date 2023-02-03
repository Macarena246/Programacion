/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class CasiCero {
    
    /*Un programa que pida por teclado un número decimal e indique si es un número
    casi-cero, que son aquellos positivos o negativos que se acercan a 0 por menos de 1 unidad,
    aunque curiosamente el 0 no se considera un número casi-cero. Ejemplos de números casi 0 son el 0,3
    el -0,99 el 0,123; Algunos números que no se consideran casi-cero son el 12,3 el 0 o el -1.*/
    
     public static void main (String [] args){
     
     Scanner numero= new Scanner (System.in);
     System.out.println("Introduzca un número decimal: ");
     double decimal= numero.nextDouble();
     if(decimal<1 && decimal>-1 && decimal!=0){
         System.out.println("El número introducido es casi-cero.");
     }
     else {
         if(decimal==0){
         System.out.println("El 0 no es un número casi-cero.");
         }    
         else {
         System.out.println("No es un número casi-cero.");
         }
         
     } 
     
     }
    
}
