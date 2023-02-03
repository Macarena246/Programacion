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
public class Ej11TablaMultip {

    /*Implementar una aplicación que pida al usuario un número comprendido
    entre 1 y 10. Hay que mostrar la tabla de multiplicar de dicho número,
    asegurándose de que el número introducido se encuentra en el rango establecido.*/
    
    public static void main(String[] args) {

        int num;
        Scanner numero = new Scanner(System.in);
        System.out.println("Introduzca un número del 1 al 10: ");
        num = numero.nextInt();
        System.out.println("La tabla del " + num + " es: ");
        for (int i = 0; i < 11; i++) {
            System.out.println(num + " X " + i + " = " + i*num);
        }
    }
}
