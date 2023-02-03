/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej6Vocal {
    
    /*Crear una función que, mediante un booleano, indique si el carácter que se
pasa como parámetro de entrada corresponde con una vocal.*/
    
    static boolean esVocal(char letra) {
        
        boolean resultado = false;
        switch (letra){
          
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                resultado = true;
        }
        
        return resultado;
    }

    public static void main(String[] args) {

        Scanner vocal = new Scanner (System.in);
        System.out.println("Introduce una letra para saber si es una vocal: ");
        char letra = vocal.next().charAt(0);
        boolean resultado = esVocal(letra);
        System.out.println(resultado);
    }
    
}
