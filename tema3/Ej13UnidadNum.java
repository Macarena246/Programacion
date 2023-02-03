/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej13UnidadNum {

    /*Diseñar un programa que pida al usuario un número positivo y lo muestre
unidad a unidad. Por ejemplo, para el número 123, debe mostrar primero el 3,
a continuación el 2, y por último el 1.*/
    
    
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Introduce un número positivo: ");
        int n = num.nextInt();
                
        for (int i = 1; i < n ; i *= 10) {
           
            int resultado = (n % (i * 10)) / i;
            System.out.println(resultado);
        }
       
        System.out.print("");
    }
}
