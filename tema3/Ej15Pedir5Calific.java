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
public class Ej15Pedir5Calific {

    /*Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.*/
    
    
    public static void main(String[] args) {

        Scanner cali = new Scanner(System.in);
        double n;
        int suspenso = 0;
        System.out.println("Introduzca la calificaciones de los alumnos: ");

        for (double i = 1; i < 6; i++) {
            n = cali.nextDouble();

            if (n < 5) {
                suspenso++;
            }
        }
        if (suspenso == 0) {
            System.out.println("No hay ningún suspenso.");
        } else if (suspenso == 1) {
            System.out.println("Hay " + suspenso + " suspenso.");
        } else {
            System.out.println("Hay " + suspenso + " suspensos.");
        }
    }
}
