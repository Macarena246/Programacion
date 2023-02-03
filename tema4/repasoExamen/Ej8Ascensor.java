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
public class Ej8Ascensor {
    
    /*Elabore un método que simule el proceso de subir a un piso en un ascensor,
    donde el numero de piso es ingresado por teclado.*/
    
    static void subirPiso (){
        
        Scanner num = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        int n = num.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Sube al piso " + i);
        }
                
    }
    
    public static void main(String[] args) {
        subirPiso();
    }
}
