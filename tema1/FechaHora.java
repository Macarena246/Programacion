/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1;

import java.time.LocalDateTime;

/**
 *
 * @author Macarena
 */
public class FechaHora {
    
    /*Escribir unas líneas de código que nos muestren por pantalla
    la hora actual del sistema.*/
    
    public static void main (String [] args) {
    
   LocalDateTime fecha = LocalDateTime.now ();
    
   System.out.println (fecha);
   //LocalDateTime para fecha y hora actual
    
    }
}
