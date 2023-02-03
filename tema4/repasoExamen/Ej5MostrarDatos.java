/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.repasoExamen;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej5MostrarDatos {
    
    /*Crear un método que muestre los datos (nombre, apellido y la edad)
    de un usuario, ingresado por teclado.*/
    
    static void datos (){
        
        Scanner num = new Scanner (System.in);
        System.out.println("Introduzca el nombre: ");
        String nombre = num.next();
        System.out.println("Introduzca los apellido: ");
        String apellido = num.next();
        System.out.println("Introduce la edad: ");
        int edad = num.nextInt();
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }
    
    public static void main(String[] args) {
        
        datos();
    }
    
}
