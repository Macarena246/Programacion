/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej113NumMulti {
    
    /*Hacer una función que pida tres números decimales y muestre por consola la
    multiplicación de ellos.*/
    
    static void multiplicacion (){
        
        Scanner numero = new Scanner (System.in);
        System.out.println("Introduzca tres números que quiera multiplicar: ");
        double num1 = numero.nextDouble();
        double num2 = numero.nextDouble();
        double num3 = numero.nextDouble();
        double resultado = num1 * num2 * num3;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
    
    public static void main(String[] args) {
        
        multiplicacion();
    }
}
