/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej8ContadorPrimos {

    /*Diseñar una función a la que se le pase un número entero y devuelva el
número de divisores primos que tiene.*/
    
    
    static boolean esPrimo(int num) {

        boolean primo = true;
        int contador = 2;
        while ((primo) && contador != num) {
            if (num % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }

    static int divisores(int dividendo) {

        int contador = 1;

        for (int i = 2; i < dividendo; i++) {

            if (esPrimo(i)) {
                if (dividendo % i == 0) {
                    //System.out.println(i);
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        int num;
        Scanner numero = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num = numero.nextInt();

        int divi = divisores(num);
        switch (divi) {
            case 0:
                System.out.println("El número " + num + " no tiene divisores primos.");
                break;
            case 1:
                System.out.println("El número " + num + " tiene " + divi + " divisor primo.");
                break;
            default:
                System.out.println("El número " + num + " tiene " + divi + " divisores.");
                break;
        }
    }

}
