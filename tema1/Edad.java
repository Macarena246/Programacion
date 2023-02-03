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
public class Edad {
    
    /*Pedir al usuario su edad y mostrar la que tendrá el próximo año.*/
    
    public static void main (String [] args) {
    
        System.out.println ("Introduzca su edad: ");
        Scanner edades = new Scanner (System.in);
        int edad = edades.nextInt();
        int edad2 = edad+1;
        System.out.println("El año que viene su edad será: "+edad2);
    }
}
