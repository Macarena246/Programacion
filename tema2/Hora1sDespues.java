/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Hora1sDespues {
    
    /*Escribir un programa que pida una hora de la siguiente forma: hora, minutos y segundos.
    El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
    hora actual [10:41:59\]-+ hora actual + 1 segundo: [10:41:00]*/
    
    public static void main (String [] args){
        
        Scanner numero= new Scanner (System.in);
        
        System.out.println("Introduzca la hora actual: ");
        int hora= numero.nextInt();
        
            if (!(hora>=0 && hora<=24)){
            System.out.println("La hora no es válida.");
            }
        
        
        System.out.println("Introduzca los minutos actuales: ");
        int minutos= numero.nextInt();
        
        
        System.out.println("Introduzca los segundos actuales: ");
        int segundos= numero.nextInt();
        segundos++;
        
        
        if (segundos==60){
        minutos++;
        segundos=0;
        }
        
        if (minutos==60){
        hora++;
        minutos=0;
        }
        
        if (hora>=24){
        hora=0;
        }
        
        System.out.println("La hora actual es: [" + hora + ": " + minutos + ": " +segundos + "]");
        
    }
}
