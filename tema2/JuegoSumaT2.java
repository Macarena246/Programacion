/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class JuegoSumaT2 {

    /*Realiza el "juego de la suma", que consiste en que aparezcan dos números aleatorios
    (comprendidos entre 1 y 99) que el usuario tiene que sumar. La aplicación debe indicar si
    el resultado es correcto o incorrecto.*/
    
    
    public static void main(String[] args) {

        Random num = new Random();
        int a = num.nextInt(100);
        int b = num.nextInt(100);
        System.out.println("Realice la suma de los siguientes números: " + a + " " + b);

        Scanner numero = new Scanner(System.in);
        System.out.println("Luego introduzca el resultado: ");
        int c = numero.nextInt();
        if (c == a + b) {
            System.out.println("La suma es correcta.");

        } else {
            System.out.println("La suma de ambos números es incorrecta.");
        }
    }

}
