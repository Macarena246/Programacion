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
public class Ej8ContarNum {

    /*Escribir una aplicación para aprender a contar, que pedirá un número n y
mostrará todos los números del 1 a n.*/
    
    
    public static void main(String[] args) {

        int numero;
        Scanner num = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        numero = num.nextInt();
        for (int a = 1; a <= numero; a++) {
            System.out.println(a);
        }
    }
}
