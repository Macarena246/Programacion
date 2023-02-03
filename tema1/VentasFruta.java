/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class VentasFruta {
    
    /*Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
    Por este motivo es necesario diseñar una aplicación que solicite las ventas (en kg) de cada
    semestre para cada fruta. La aplicación mostrará el importe total sabiendo que el precio del kilo
    de manzanas está fijado en 2,35 € y el kilo de peras en 1,95 €.*/
    
     public static void main (String [] args){
     
     Scanner ventas= new Scanner(System.in);
     System.out.println("Introduzca las ventas de manzanas del primer semestre: ");
     double manzanas1= ventas.nextDouble();
     System.out.println("Introduzca las ventas de manzanas del segundo semestre: ");
     double manzanas2= ventas.nextDouble();
     System.out.println("Introduzca las ventas de peras del primer semestre: ");
     double peras1= ventas.nextDouble();
     System.out.println("Introduzca las ventas de peras del segundo semestre: ");
     double peras2= ventas.nextDouble();
     double ganancias= (manzanas1+manzanas2)*2.35 + (peras1+peras2)*1.95;
     
     System.out.println("Los beneficios este año han sido: " + ganancias + " €");
     
     }
}
