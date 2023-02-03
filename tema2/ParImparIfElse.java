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
public class ParImparIfElse {
    
    /*Mismo ejercicio que ParImparIf pero aplicando doble condicional: "else".*/
    
     public static void main (String [] args){
    
        Scanner numeros= new Scanner (System.in);
        System.out.println("Introduza un número: ");
        double a= numeros.nextDouble();
        if (a%2==0){
        System.out.println("Es par");
        }
        else {System.out.println("Es impar");}
        
    }
}
