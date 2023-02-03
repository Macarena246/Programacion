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
public class Ej18MCD2Num {
    

    /*Escribir una función que calcule de forma recursiva el máximo común divisor
    de dos números.*/
   
    
    public static int mcd(int a, int b) {

        int resultado;
        if (a == 0) {
            resultado = b;
        } else if (b == a) {
            resultado = a;
        } else {              // LLAMADAS RECURSIVAS
            if (a >= b) {
                resultado = mcd(a - b, a);
            } else {
                resultado = mcd(a, b - a);
            }
        }

        return resultado;

    }

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Introduce los números: ");
        int num1 = numero.nextInt();
        int num2 = numero.nextInt();

        int resultado = mcd(num1, num2);
        System.out.println("El MCD es " + resultado + ".");

    }

//    Otra forma:
//    public static int mcdOtra(int num1, int num2){
//        
//        int a = Math.max(num1, num2);
//        int b = Math.min(num1, num2);
//        
//        int resultado = 0;
//        do {
//            resultado = b;
//            b = a % b;
//            a = resultado;
//        } while (b != 0);
//        
//        return resultado;
//    }
}
