/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */

/*Escribir el método int leerEntero(), que pide un entero por consola, lo lee del teclado y lo devuelve. Si la cadena introducida
por consola no tiene el formato correcto, muestra un mensaje de error y vuelve a pedirlo.*/

public class LeerEntero {

    public static int leerEntero() {

        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        boolean correcto = false;

        do {
            try {
                System.out.print("Introduce un número entero: ");
                numero = Integer.parseInt(entrada.nextLine());
                correcto = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un número entero que sea válido.");
            }
        } while (!correcto);

        return numero;
    }
}
