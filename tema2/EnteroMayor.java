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
public class EnteroMayor {
    
    /*Pedir dos números enteros y mostrar cuál es el mayor.*/
    
   public static void main (String [] args){
   
       Scanner entero= new Scanner (System.in);
       System.out.println("Introduzca dos números enteros: ");
       int a= entero.nextInt();
       int b= entero.nextInt();
       
       if (a==b){
       System.out.println("Los números son iguales");
       }
       else {if (a>b){
           System.out.println(a+ " es el número mayor.");
            }
            else {System.out.println(b+ " es el numero mayor.");
                 }  
            }
    } 
}
