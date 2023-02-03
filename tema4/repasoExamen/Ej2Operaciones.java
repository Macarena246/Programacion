/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.repasoExamen;

/**
 *
 * @author Macarena
 */
public class Ej2Operaciones {
    
    /*MUESTRE POR PANTALLA LOS RESULTADOS DE LAS CUATRO OPERACIONES BÁSICAS, DE DOS NÚMEROS*/
    
    static void operacion (double a, double b){
        
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        if (b == 0){
            System.out.println("División: No es posible dividir entre 0.");
            
        } else {
            System.out.println("División: " + (a / b));
        }
    }
    
    public static void main(String[] args) {
        operacion (4, 0);
    }
    
}
