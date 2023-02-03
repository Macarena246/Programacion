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
public class MayordeEdad {
    
    /*Realizar una aplicación que solicite al usuario su edad y le indique si es
    mayor de edad (mediante un literal booleano: true o false).*/
    
    public static void main (String [] args){
    
        System.out.println("Introduzca su edad: ");
        Scanner sc = new Scanner(System.in);
        int edad=sc.nextInt();
        boolean truefalse = edad>=18;
        System.out.println (truefalse);
    }
}
