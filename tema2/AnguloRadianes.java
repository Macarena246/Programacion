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
public class AnguloRadianes {

    /*Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo y muestre el equivalente
    en radianes. Si el ángulo introducido por el usuario no se encuentra en el rango de 0º a 360º, hay que
    transformarlo a dicho rango. Nota: el operador módulo puede ayudarnos a convertir un ángulo a su
    equivalente en el rango comprendido de 0º a 360º.*/
    
    
    public static void main(String[] args) {

        Scanner grados = new Scanner(System.in);
        double angulo;
        System.out.println("Indique cuántos grados tiene el ángulo: ");
        angulo = grados.nextDouble();
        if (angulo >= 0 && angulo <= 360) {
            double radianes = angulo * Math.PI / 180;
            System.out.println("El resultado es: " + radianes + " rad.");
        } else {
            double modulo = angulo % 360;
            double radianes = modulo * Math.PI / 180;
            System.out.printf("El ángulo convertido a su equivalente es de %dº, que en radianes sería %.5f rad. %n", (int) modulo, radianes);
        }

    }
}
