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
public class Ej10Media10Num {

    /*Pedir diez números enteros por teclado y mostrar la media.*/
    
    
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        int suma = 0;
        int media;
        for (int a = 1; a < 11; a++) {
            System.out.println("Inserte un número: ");
            int numero = valor.nextInt();
            suma = suma + numero;
        }
        media = suma / 10;
        System.out.println("La media es: " + media + ".");
    }
}
