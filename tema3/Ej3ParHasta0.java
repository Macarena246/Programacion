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
public class Ej3ParHasta0 {

    /*Diseñar un programa que muestre, para cada número introducido por teclado, si es par.
    El proceso se repetirá hasta que el número introducido sea 0.*/
    
    
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        boolean parar = true;
        
        while (parar) {
            System.out.println("Introduzca un número: ");
            double num = numero.nextDouble();
            if (num == 0) {
                parar = false;
                System.out.println("El número es par.");
            } else {
                if (num % 2 == 0) {
                    System.out.println("El número es par.");
                } else {
                    System.out.println("El número es impar.");
                }
            }
        }
    }
}
