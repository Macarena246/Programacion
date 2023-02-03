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
public class Ej18CantDinero {

    /*Escribe un programa que solicite al usuario las distintas cantidades de dinero de
las que dispone. Por ejemplo: la cantidad de dinero que tiene en el banco en una
hucha, en un cajón y en los bolsillos.
La aplicación mostrará la suma total de dinero de la que dispone el usuario.
La manera de especificar que no se desea introducir más cantidades es mediante
el cero.*/
    
    
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int suma = 0;

        System.out.println("Introduzca las distintas cantidades de dinero: ");
        System.out.println("Si no desea introducir más cantidad, ponga 0.");
        for (int i = 1; i != 0; i++) {
            i = num.nextInt();
            if (i == 0) {
                System.out.println("Dispone de un total de " + suma + " €.");

            } else {
                suma += i;
            }
        }
        System.out.println("Dispone de un total de " + suma + " €.");
    }
}
