/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.SimulacroPrueba;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej3AlmacenarElementos {

    /*Crear una función que pida por teclado 5 elementos y los almacene en una tabla.*/
    
    
    static int[] nuevoElemento(int tabla[], int num) {

        int[] res = new int[tabla.length + 1];
        for (int i = 0; i < tabla.length; i++) {

            res[i] = tabla[i];
        }

        res[tabla.length] = num;

        return res;
    }

    static int[] almacen() {

        int tabla[] = new int[0];
        Scanner numero = new Scanner(System.in);
        System.out.println("Introduce 5 números: ");
        for (int i = 0; i < 5; i++) {
            int num = numero.nextInt();
            tabla = nuevoElemento(tabla, num);
        }

        return tabla;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(almacen()));
    }

}
