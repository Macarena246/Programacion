/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema10;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */

/*Crear una lista de números enteros positivos introducidos por consola hasta que se introduzca uno negativo.
  A continuación, recorrer la lista y mostrar por pantalla los índices de los elementos de valor par, que será
  multiplicado por 100.*/
public class ListaNumPos {
    
    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        int dato = 0;
        
        while(dato >= 0){
            System.out.println("Introduzca un número entero positivo. Si desea terminar, introduzca uno negativo.");
            dato = numero.nextInt();
            if(dato >= 0){
                listaEnteros.add(dato);
            }
        }
        
        for(int i =0; i < listaEnteros.size(); i++){
            if(listaEnteros.get(i) % 2 == 0){
                System.out.println("El índice " + i * 100 + " es par: " + listaEnteros.get(i));
                listaEnteros.set(i, listaEnteros.get(i));
            }
        }
        
        System.out.println("La lista de valores pares cuyo índice está multiplicado por 100 es: " + listaEnteros);
    }
    
}
