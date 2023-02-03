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
public class Ej7Pelicula {

    /*Implementa la aplicación Película, que pide al usuario un número y muestra en pantalla
la salida:
¿Hoy vamos a ver una peli?
¿Hoy vamos a ver una peli?
¿Hoy vamos a ver una peli?
Se muestra «¿Hoy vamos a ver una peli?...» tantas veces como indique el número
introducido. La salida anterior sería para el número 3.*/
    
    
    public static void main(String[] args) {

        int numero;
        Scanner num = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        numero = num.nextInt();

        for (int a = 0; a < numero; a++) {
            System.out.println("¿Hoy vamos a ver una peli?");
        }
    }
}
