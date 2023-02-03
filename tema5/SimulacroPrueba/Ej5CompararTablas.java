/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.SimulacroPrueba;

/**
 *
 * @author Macarena
 */
public class Ej5CompararTablas {
    
    /*Crear una función a la que se le pasen dos tablas y nos diga cuál contiene
    una menor suma de sus elementos*/
    
    static void sumaTablas (int tabla1[], int tabla2 []){
        
        int suma1 = 0;
        int suma2 = 0;
        for (int i = 0; i < tabla1.length; i++) {
            suma1 = suma1 + tabla1[i];
        }
        for (int i = 0; i < tabla2.length; i++) {
            suma2 = suma2 + tabla2[i];
        }
        
        if(suma1 == suma2){
            System.out.println("Las tablas pesan igual.");
        } else if (suma1 > suma2){
            System.out.println("La tabla 1 tiene una suma mayor que la tabla 2. (" + suma1 + ") > (" + suma2 + ")");
        } else {
            System.out.println("La tabla 2 tiene una suma mayor que la tabla 1. (" + suma2 + ") > (" + suma1 + ")");
        }
    }
    
    public static void main(String[] args) {
        
        int tablaUno [] = {1, 2, 3, 4, 5};
        int tablaDos [] = {4, 4, 4, 4, 4};
        
        sumaTablas(tablaUno, tablaDos);
    }
    
}
