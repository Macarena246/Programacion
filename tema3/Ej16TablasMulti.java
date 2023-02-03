/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author Macarena
 */


public class Ej16TablasMulti {

    /*Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.*/
    
    
    public static void main(String[] args) {

        int resultado;
        for (int i = 0; i <= 10; i++) {
            System.out.println("_____________");
            System.out.println("Tabla del " + i);
            for (int j = 0; j <= 10; j++){
                resultado = i*j;
                System.out.println(i + " X " + j + " = " + resultado);
            }
        }
    }
}
