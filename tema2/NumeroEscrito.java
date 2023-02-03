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
public class NumeroEscrito {

    /*Escribe un programa que solicite al usuario un número comprendido entre 1 y 99.
    El programa debe mostrarlo con letras, por ejemplo, para 56 se verá: cincuenta y seis.*/
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int a;

        System.out.println("Introduzca un número entre 1 y 99: ");
        a = numero.nextInt();
        if (a > 0 && a < 100) {

            String primerNum = "", segundoNum = "";
            int unidad = (a % 100) % 10;
            int decena = (a % 100) / 10;

            if (a > 0 && a < 21) {
                switch (a) {

                    case 1:
                        System.out.println("El número introducido es uno.");
                        break;
                    case 2:
                        System.out.println("El número introducido es dos.");
                        break;
                    case 3:
                        System.out.println("El número introducido es tres.");
                        break;
                    case 4:
                        System.out.println("El número introducido es cuatro.");
                        break;
                    case 5:
                        System.out.println("El número introducido es cinco.");
                        break;
                    case 6:
                        System.out.println("El número introducido es seis.");
                        break;
                    case 7:
                        System.out.println("El número introducido es siete.");
                        break;
                    case 8:
                        System.out.println("El número introducido es ocho.");
                        break;
                    case 9:
                        System.out.println("El número introducido es nueve.");
                        break;
                    case 10:
                        System.out.println("El número introducido es diez.");
                        break;
                    case 11:
                        System.out.println("El número introducido es once.");
                        break;
                    case 12:
                        System.out.println("El número introducido es doce.");
                        break;
                    case 13:
                        System.out.println("El número introducido es trece.");
                        break;
                    case 14:
                        System.out.println("El número introducido es catorce.");
                        break;
                    case 15:
                        System.out.println("El número introducido es quince.");
                        break;
                    case 16:
                        System.out.println("El número introducido es deciséis.");
                        break;
                    case 17:
                        System.out.println("El número introducido es diecisiete.");
                        break;
                    case 18:
                        System.out.println("El número introducido es dieciocho.");
                        break;
                    case 19:
                        System.out.println("El número introducido es diecinueve.");
                        break;
                    case 20:
                        System.out.println("El número introducido es veinte.");
                        break;

                }

            } else {

                switch (decena) {
                    case 2:
                        primerNum += "veinti";
                        break;
                    case 3:
                        primerNum += "treinta";
                        break;
                    case 4:
                        primerNum += "cuarenta";
                        break;
                    case 5:
                        primerNum += "cincuenta";
                        break;
                    case 6:
                        primerNum += "sesenta";
                        break;
                    case 7:
                        primerNum += "setenta";
                        break;
                    case 8:
                        primerNum += "ochenta";
                        break;
                    case 9:
                        primerNum += "noventa";
                        break;
                }

                switch (unidad) {

                    case 1:
                        segundoNum += "uno";
                        break;
                    case 2:
                        segundoNum += "dos";
                        break;
                    case 3:
                        segundoNum += "tres";
                        break;
                    case 4:
                        segundoNum += "cutro";
                        break;
                    case 5:
                        segundoNum += "cinco";
                        break;
                    case 6:
                        segundoNum += "seis";
                        break;
                    case 7:
                        segundoNum += "siete";
                        break;
                    case 8:
                        segundoNum += "ocho";
                        break;
                    case 9:
                        segundoNum += "nueve";
                        break;
                }
                if (unidad == 0) {
                    System.out.println("El número es " + primerNum + ".");
                } else {
                    System.out.println("El número es " + primerNum + " y " + segundoNum + ".");
                }
            }

        } else {
            System.out.println("El número no está comprendido entre 0 y 99.");
        }
    }
}
