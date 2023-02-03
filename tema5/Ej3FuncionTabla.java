/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author Macarena
 */
public class Ej3FuncionTabla {
    
    /*Crear una función a la que se le pase una tabla de enteros y devuelva su longitud.
    Probar dicha función en el main.*/
    
    static int longitud (int tabla[]){
    
        int valor = tabla.length;
        return valor;
    }
    
    
    public static void main(String[] args) {
        
        
        int n [] = {1, 2, 7, 4, 6, 0};
        System.out.println(longitud (n));
    }
}
