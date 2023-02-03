/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class CifrasNumEntero {
    
    /*Escribir una aplicación que indique cuántas cifras tiene un número entero introducido por
    teclado que estará comprendido entre 0 y 99999.*/
    
    public static void main (String [] args){
    
        Scanner numero= new Scanner (System.in);
        System.out.println("Introduzca un número comprendido entre 0 y 99999: ");
        int entero= numero.nextInt();
        
        if (entero>=0 && entero<=9){
        System.out.println("El número tiene una cifra.");
        }
        else if (entero>=10 && entero<=99){
        System.out.println("El número tiene dos cifras.");
        }
        else if (entero>=100 && entero<=999){
        System.out.println("El número tiene tres cifras.");
        }
        else if (entero>=1000 && entero<=9999){
        System.out.println("El número tiene cuatro cifras.");
        }
        else if (entero>=10000 && entero<=99999){
        System.out.println("El número tiene cinco cifras.");
        }
        else {
        System.out.println("El número introducido no está comprendido entre 0 y 99999.");
        } /*No es necesario poner else if en este, porque significa que si no se cumple todo lo anterior,
        directamente ocurra lo que mostramos por pantalla.*/
        }
    }
