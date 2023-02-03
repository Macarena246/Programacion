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
public class Ej5Suma10Num {

    /*Programa que lea 10 números desde teclado en un proceso repetitivo y
muestre la suma. Realizar el programa con <<do-while>>*/
    
    
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        double num;
        int inicio = 0;
        double suma = 0;

        do {
            System.out.println("Introduzca un número: ");
            num = numero.nextDouble();
            suma += num;
            inicio++;
        } while (inicio < 10);

        System.out.println("La suma es: " + suma);
    }
}
