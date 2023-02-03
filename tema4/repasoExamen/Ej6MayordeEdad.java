/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.repasoExamen;

import java.util.Scanner;
import static tema4.repasoExamen.Ej5MostrarDatos.datos;

/**
 *
 * @author Macarena
 */
public class Ej6MayordeEdad {
    
    /*Diseñe un método que imprima los datos de una persona ingresados por teclado
    e indicar si es mayor o menor de edad.*/
    
    static void mayorEdad(){
        
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
        if (edad >= 18){
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }
    
    public static void main(String[] args) {
        mayorEdad();
    }
}
