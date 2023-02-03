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
public class Ej23NumElev2 {

    /*Leer un número y mostrar su cuadrado. Repetir el proceso hasta que se
introduzca un número negativo.*/
    
    public static void main(String[] args) {

        double n = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Introduzca el número que quiere elevar al cuadrado: ");

        do {
            n = num.nextDouble();
            if (n > 0){
            double resultado = n * n;
            System.out.println("El cuadrado de " + n + " es " + resultado);
            }
        } while (n >= 0);
    }
}
