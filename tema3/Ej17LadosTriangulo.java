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
public class Ej17LadosTriangulo {

    /*Pedir por consola un número n y dibujar un triángulo rectángulo de n
elementos de lado, utilizando para ello asteriscos (*). Por ejemplo, para n= 4: (4x4 asteriscos)*/
    
    
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int n;
        System.out.println("Introduzca un número: ");
        n = num.nextInt();
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
