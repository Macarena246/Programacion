/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Macarena
 */
public class Ej6JuegoSumaT3 {

    /*Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El
jugador tendrá que introducir la solución de la suma de dos números
aleatorios comprendidos entre 1 y 100. Mientras la solución introducida sea
correcta, el juego continuará. En caso contrario, el programa terminará y
mostrará el número de operaciones realizadas correctamente.*/
    
    
    public static void main(String[] args) {

        int num1, num2, num3;
        int inicio = 1;
        int acierto = -1;
        boolean mensaje = false;

        do {
            Random numero = new Random();
            num1 = numero.nextInt(101);
            num2 = numero.nextInt(101);
            if (mensaje == false) {
                System.out.println("Realice la suma de los siguientes números: " + num1 + " y " + num2);
                System.out.println("Introduzca el resultado. Si es correcto, podrá continuar jugando.");
                mensaje = true;
            } else {
                System.out.println("¡Genial! ¡A por la siguiente!");
                System.out.println(num1 + " y " + num2);
            }
            Scanner solucion = new Scanner(System.in);
            num3 = solucion.nextInt();
            acierto++;
        } while (num3 == num1 + num2);
        System.out.println("Vaya... No es correcto. Tienes " + acierto + " aciertos.");
    }
}
