/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.repasoExamen;

/**
 *
 * @author Macarena
 */
public class Ej1MostrarNveces {
    
    /*REALIZAR UNA FUNCIÓN, A LA QUE SE LE PASE COMO PARÁMETRO UN NÚMERO "N",
      Y MUESTRE POR PANTALLA "N" VECES  "MÓDULO EJECUTÁNDOSE."*/
    
    static int numero (int n){
        
        int res = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Módulo ejecutándose...");
        }
        
        return res;
    }
    
    
    public static void main(String[] args) {
        
        int a = numero (3);
    }
}
