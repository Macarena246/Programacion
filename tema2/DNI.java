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
public class DNI {

    /*El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene
    a partir del número de la siguiente forma: letra=número DNI%23. Diseña una aplicación
    en la que dado un número de DNI, calcule la letra que le corresponde. Observa que un número
    de 8 dígitos está dentro del rango de tipo int.*/
    
    
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Introduzca su DNI sin la letra: ");
        int DNI = numero.nextInt();
        int letra = DNI % 23;

        if (DNI > 9999999 && DNI <= 999999999 && DNI > 0) {
            switch (letra) {

                case 0:
                    System.out.println("Le corresponde la letra T.");
                    break;
                case 1:
                    System.out.println("Le corresponde la letra R.");
                    break;
                case 2:
                    System.out.println("Le corresponde la letra W.");
                    break;
                case 3:
                    System.out.println("Le corresponde la letra A.");
                    break;
                case 4:
                    System.out.println("Le corresponde la letra G.");
                    break;
                case 5:
                    System.out.println("Le corresponde la letra M.");
                    break;
                case 6:
                    System.out.println("Le corresponde la letra Y.");
                    break;
                case 7:
                    System.out.println("Le corresponde la letra F.");
                    break;
                case 8:
                    System.out.println("Le corresponde la letra P.");
                    break;
                case 9:
                    System.out.println("Le corresponde la letra D.");
                    break;
                case 10:
                    System.out.println("Le corresponde la letra X.");
                    break;
                case 11:
                    System.out.println("Le corresponde la letra B.");
                    break;
                case 12:
                    System.out.println("Le corresponde la letra N.");
                    break;
                case 13:
                    System.out.println("Le corresponde la letra J.");
                    break;
                case 14:
                    System.out.println("Le corresponde la letra Z.");
                    break;
                case 15:
                    System.out.println("Le corresponde la letra S.");
                    break;
                case 16:
                    System.out.println("Le corresponde la letra Q.");
                    break;
                case 17:
                    System.out.println("Le corresponde la letra V.");
                    break;
                case 18:
                    System.out.println("Le corresponde la letra H.");
                    break;
                case 19:
                    System.out.println("Le corresponde la letra L.");
                    break;
                case 20:
                    System.out.println("Le corresponde la letra C.");
                    break;
                case 21:
                    System.out.println("Le corresponde la letra K.");
                    break;
                case 22:
                    System.out.println("Le corresponde la letra E.");
                    break;
            }

        } else {
            System.out.println("El número debe contener 8 dígitos y ser positivo.");
        }
    }

}
