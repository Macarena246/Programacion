/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author Macarena
 */
public class Ej13Recursividad {

    //Hacer una función que muestre el factorial de un número.
    
    static int factorial(int n) {

        int resultado = 1;
        for (int i = 0; n > i; i++) {

            resultado = resultado * (n - i);

        }

        return resultado;
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }

}
