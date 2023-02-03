/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Arrays;

/**
 *
 * @author Macarena
 */
public class EjXTabla10Enteros {

    /*Crear una tabla de 10 elementos enteros. Rellenarlos de cualquier manera.
    Realizar los siguientes métodos para aplicarle a esa tabla:
    a) insertar nuevo elemento
    b) borrar un elemento según la posición que se le pase
    c) vaciar la tabla
    d) mostrar la tabla por consola */
    
    
    //a)
    static int[] nuevoElemento(int tabla[], int num) {

        int[] res = new int[tabla.length + 1];
        for (int i = 0; i < tabla.length; i++) {

            res[i] = tabla[i];
        }

        res[tabla.length] = num;

        return res;
    }

    //b)
    static int[] borrar(int[] tabla, int posicion) {

        int[] res = new int[tabla.length - 1];
        for (int i = 0, j = 0; i < tabla.length; i++) {
            if (i != posicion) {
                res[j++] = tabla[i];
            }
        }

        return res;
    }

    //c)
    static void limpiar(int[] tabla) {

        Arrays.fill(tabla, 0);
    }

    //d)
    static void mostrar(int[] tabla) {

        System.out.println(Arrays.toString(tabla));

    }

    public static void main(String[] args) {

        int elementos[] = new int[]{2, 4, 6, 4, 5};

        elementos = nuevoElemento(elementos, 16);
        elementos = borrar(elementos, 3);
        mostrar(elementos);
        limpiar(elementos); //Si lo pongo antes de mostrar, al compilar aparece la tabla con 0.

    }

}
