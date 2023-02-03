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
public class Examen {
    
    /*Crear un programa que pida dos números a y b y nos muestre true si son iguales
    o false en caso contrario.*/
    
    public static void main (String [] args){
    
        Scanner numeros= new Scanner (System.in);
        System.out.println("Introduzca un número: ");
        double a= numeros.nextDouble();
        System.out.println("Introduzca el otro: ");
        double b= numeros.nextDouble();
        boolean respuesta= a==b;
        System.out.println(respuesta);
    }
}
