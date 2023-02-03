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
public class NotaEnteraIfElse {
    
    /*Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 a 4),
    suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10). Procedimiento con if else.*/
    
    public static void main (String [] args) {
    
        Scanner nota= new Scanner (System.in);
        System.out.println("Introduzca su nota: ");
        double numero= nota.nextDouble();
        if (numero>=0 && numero<=4.9){
        System.out.println("Insuficiente.");
        }
        else if (numero<6){
        System.out.println("Suficiente.");
        }
        else if (numero<7){
        System.out.println("Bien.");
        }
        else if (numero<9){
        System.out.println("Notable.");
        }
        else if (numero>=9 || numero<=10){
        System.out.println("Sobresaliente.");
        }
        else {
        System.out.println("No ha introducido la nota correctamente.");
        }
    }
}
