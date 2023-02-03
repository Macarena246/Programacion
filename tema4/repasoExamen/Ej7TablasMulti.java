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
public class Ej7TablasMulti {
    
    /*En un método mostrar la tabla de multiplicar de cualquier número ingresado por teclado.*/
    
    static void tablaMulti (){
        
        Scanner num = new Scanner (System.in);
        System.out.println("Introduzca un número: ");
        int n = num.nextInt();
        for (int i = n; i <= n; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i*j);
            }
        }
    }
    
    public static void main(String[] args) {
        tablaMulti();
    }
    
}
