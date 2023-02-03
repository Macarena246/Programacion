/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej5MediaPosNeg0 {

    /*Introduce por teclado un número n; a continuación, solicita al usuario que
      teclee n números. Realiza la media de los números positivos, la media de
      los negativos y cuenta el número de ceros introducidos.*/
    
    
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int n;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int sumapos = 0;
        int sumaneg = 0;
        int mediapos = 0;
        int medianeg = 0;

        do {
            System.out.println("Introduce un número mayor que 0: ");
            n = numero.nextInt();
        } while (n == 0);

        if (n == 1) {
            System.out.println("Introduce " + n + " número: ");
            n = numero.nextInt();
            if (n == 0) {
                System.out.println("Hay un cero.");
            } else {
                System.out.println("Solo hay un número introducido. La media es " + n + ".");
            }

        } else {
            System.out.println("Introduce " + n + " números: ");

            for (int i = 0; i < n; i++) {
                int a = numero.nextInt();
                if (a == 0) {
                    ceros++;

                } else if (a > 0) {
                    positivos++;
                    sumapos = sumapos + positivos;
                    mediapos = sumapos / positivos;

                } else {
                    negativos++;
                    sumaneg = sumaneg + negativos;
                    medianeg = sumaneg / negativos;
                }
            }

            if (ceros == 1) {
                System.out.println("Hay " + ceros + " cero.");
            } else {
                System.out.println("Hay " + ceros + " ceros.");
            }
            System.out.println("La media de los números positivos es " + mediapos + ".");
            System.out.println("La media de los números negativos es " + medianeg + ".");
        }

    }

}
