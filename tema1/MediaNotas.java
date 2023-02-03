/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class MediaNotas {
    
    /*Crear una aplicación que calcule la media aritmética de dos notas enteras.
    Hay que tener en cuenta que la media puede contener decimales.*/
    
    public static void main (String [] args) {
    
        System.out.println ("Introduzca la nota 1: ");
        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        System.out.println ("Introduzca la nota 2: ");
        double nota2 = sc.nextDouble();
        double media = (nota1+nota2)/2;
        System.out.println("La media de las dos notas es: " + media);
    }
}
