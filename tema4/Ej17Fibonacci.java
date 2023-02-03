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
public class Ej17Fibonacci {
    
    /*Realizar recursivamente un programa que muestre la serie de números de fibonacci.*/
    
    public static void fibonacci (long limite, long anterior, long a){
        
        if (limite > 0){
            System.out.println(a);
            fibonacci (limite - 1, a, anterior + a);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner numero = new Scanner (System.in);
        System.out.println("Introduzca el número hasta el que quiere saber la serie de Fibonacci: ");
        int num = numero.nextInt();
        System.out.println("Los primeros " + num + " números en la serie Fibonacci son: ");
        fibonacci (num, 0, 1);
    }
}
