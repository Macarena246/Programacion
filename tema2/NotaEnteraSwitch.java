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
public class NotaEnteraSwitch {
    
     /*Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 a 4),
    suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10). Procedimiento con switch.*/
    
    public static void main (String [] args){
    
        Scanner nota= new Scanner (System.in);
        System.out.println("Introduzca su nota de forma entera: ");
        int numero= nota.nextInt();
        switch (numero){
        
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente.");
                break;
                
            case 5:
                System.out.println("Suficiente.");
                break;
                
            case 6:
                System.out.println("Bien.");
                break;
                
            case 7:
            case 8:
                System.out.println("Notable.");
                break;
                
            case 9:
            case 10:
                System.out.println("Sobresaliente.");
                break;
                
            default:
                System.out.println("No es una nota comprendida entre 0 y 10.");
        }
        
    }
}
