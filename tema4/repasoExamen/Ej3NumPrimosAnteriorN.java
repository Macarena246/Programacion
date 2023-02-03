/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.repasoExamen;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej3NumPrimosAnteriorN {

    /*INGRESAR EL VALOR DE N POR TECLADO, Y MOSTRAR EN PANTALLA TODOS LOS NÚMEROS PRIMOS ANTERIORES A "N".*/
    
    
    static void mostrarValor() {

        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int n = num.nextInt();

        for (int i = 0; i < n; i--) {
            boolean primo = true;
            int contador = 2;
            while ((primo) && contador != n) {
                if (n % contador == 0) {
                    primo = false;
                }
                contador++;
            }
            
            System.out.println(primo);
        }
    }
    
    public static void main(String[] args) {
        mostrarValor ();
    }

}
