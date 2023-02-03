/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej19HorasYmin {
    
    /*Diseña una función a la que se le pasen las horas y minutos de dos instantes de tiempo
    con el siguiente prototipo: static int diferenciaMin (int hora1, minuto1, hora2, minuto2).
    La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes utilizados.*/
    
   
    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2){
        int diferencia=0;
        LocalTime inicio=LocalTime.of(hora1, minuto1);
        LocalTime fina=LocalTime.of(hora2, minuto2);
        int minutos=inicio.toSecondOfDay();
        int minutos2=fina.toSecondOfDay();
        if (minutos2>minutos){
            diferencia=(minutos2/60)-(minutos/60);  
        } else {
            diferencia=(minutos/60)-(minutos2/60);
        }
       
        return diferencia;
    }
    
    
    public static void main(String[] args) {
        
        Scanner reloj = new Scanner(System.in);
        int h1, m1, h2, m2;
        System.out.println("Escriba la primera hora con los minutos: ");
        h1 = reloj.nextInt();
        m1 = reloj.nextInt();
        System.out.println("Escriba la segunda hora con los minutos: ");
        h2 = reloj.nextInt();
        m2 = reloj.nextInt();
        System.out.println("Hsy " + diferenciaMin(h1, m1, h2, m2) + " minutos de diferencia.");
    }
    
}
