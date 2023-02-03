/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.SimulacroPrueba;

/**
 *
 * @author Macarena
 */
public class Ej1BuscarElemento {
    
    /*Crea un método al que se le pase: una tabla rellena de enteros y un entero.
    Habrá que buscar ese elemento en la tabla.*/
    
    static int buscador (int tabla[], int numero){
        
        int posicion = 0;
        int elemento;
        
        while (posicion < tabla.length && tabla [posicion] != numero){
            posicion++;
        }
        
        if (posicion < tabla.length){
            elemento = posicion;
        } else{
            elemento = -1;
        }
        return elemento;
        
    }
    
    public static void main(String[] args) {
        
        int valores [] = {1, 2, 3, 4, 5, 6};
        int entero = 4;
        System.out.println("El elemento " + entero + " se encuentra en la posición " + buscador(valores,entero) + " de la tabla.");
    }
    
}
