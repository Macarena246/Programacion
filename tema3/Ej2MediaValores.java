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
public class Ej2MediaValores {

    /*Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre
    posteriormente la suma de los valores ingresados y su promedio.*/
    
    
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        int inicio = 1;
        int suma = 0;
        int promedio;
        while (inicio <= 10) {
            System.out.println("Inserte un número: ");
            int numero = valor.nextInt();
            suma = suma + numero;
            inicio++;
        }

        promedio = suma / 10;
        System.out.println("La suma de los 10 valores es: " + suma + ".");
        System.out.println("El promedio es: " + promedio + ".");

    }
}
