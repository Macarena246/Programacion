/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class NumCapicua {

    /*Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999.
    La aplicación tendrá que indicar si el número introducido es capicúa.*/
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        int unidad;
        int decena;
        int centena;
        int millar;

        boolean resultado = false;

        System.out.println("Introduzca un número entre 0 y 9999: ");
        int a = numero.nextInt();

        unidad = (a % 100) % 10;
        decena = (a % 100) / 10;
        centena = a % 1000 / 100;
        millar = a / 1000;

        if (a > 0 && a < 10000) {
            if (unidad == millar && decena == centena && a < 10000) {
                resultado = true;
            } else if (a > 0 && unidad == centena && a < 1000) {
                resultado = true;
            } else if (a > 0 && unidad == decena && a < 100) {
                resultado = true;
            } else if (a > 0 && a < 10) {
                resultado = true;
            }

            if (resultado == true) {
                System.out.println("El número es capicúa.");
            } else {
                System.out.println("El número no es capicúa.");
            }
        } else {
            System.out.println("El número no está comprendido entre 1 y 9999.");
        }
    }
}
