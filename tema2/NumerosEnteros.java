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
public class NumerosEnteros {
    /*Pedir dos números enteros y que nos diga false si uno es 0 o son iguales
    y true si son distintos.*/
    
    public static void main (String [] args){
        
        Scanner numero= new Scanner (System.in);
        System.out.println("Introduzca un número entero: ");
        int a= numero.nextInt();
         System.out.println("Introduzca otro entero: ");
        int b= numero.nextInt();
        boolean distintos= a!=b; 
        boolean cero= (a==0)||(b==0);
        boolean respuesta = distintos||cero;
        System.out.println(respuesta);
}    
}
