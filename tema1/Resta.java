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
public class Resta {
    
   /*Crear un programa que pida dos números al usuario y calcule la diferencia.*/ 
   
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        double numero1=numeros.nextDouble();
        System.out.println("Introduzca el segundo: ");
        double numero2=numeros.nextDouble();
        double resta= numero1-numero2;
        System.out.println ("El resultado es: " + resta);
        
    
    }
}
