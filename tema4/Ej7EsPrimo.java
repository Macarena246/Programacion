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
public class Ej7EsPrimo {
    
    /*Diseñar una función con el siguiente prototipo:

    boolean esPrimo(int n)

    que devolverá true si n es primo y false en caso contrario*/
    
    static boolean esPrimo(int num) {
        boolean primo = true;
        int contador = 2;
        while ((primo) && contador != num){
            if (num % contador == 0)
                primo = false;
            contador ++;
        }
        return primo;
    }
    
    public static void main(String[] args) {
        
        int n;
        Scanner numero = new Scanner (System.in);
        System.out.println("Escribe un número: ");
        n = numero.nextInt();
        boolean primo = esPrimo(n);
        
        if (primo == true){
            System.out.println("El número " + n + " es primo.");
        } else {
            System.out.println("El número " + n + " no es primo.");
        }
        
    }
    
}
