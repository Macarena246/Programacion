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
public class Ej4NumRepetido {

    /*Realiza un programa en Java que lea dos números pasados por teclado en
    un proceso repetitivo. Este proceso terminará cuando los números leídos
    sean iguales.*/
    
    
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        double a, b;
        do {
            System.out.println("Introduzca un número: ");
            a = numero.nextDouble();
            System.out.println("Introduzca otro: ");
            b = numero.nextDouble();
            
        } while (a!=b);
        System.out.println("Son iguales.");
    }
}
