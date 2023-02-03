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
public class Ej16NumNaturales {
    
    /*Crea un método que obtenga la suma de los números naturales desde 1
    hasta N. Se debe pasar como parámetro el número N*/
    
    public static int suma (int a){
        
        int resultado;
        if (a == 1){
            resultado = 1;
        } else{
            resultado = a + (suma (a - 1));
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
    
        Scanner numero = new Scanner (System.in);
        System.out.println("Introduzca un número: ");
        int num = numero.nextInt();
        
        System.out.println(suma(num));
    }
    
}
