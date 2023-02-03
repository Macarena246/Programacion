/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author Macarena
 */
public class Ej12Sobrecargas {
    
    //Mostrar el máximo de 3 números. Llamamos a la función que creamos en el Ej 5.
    
    static int maximo (int a, int b){
        int resultado;
        if (a > b) {
            resultado = a;
        }else {
            resultado = b;
        }
        return resultado;
        
    }
    
    static int maximo (int a, int b, int c){
        
        int resultado;
        if (a > b && a > c){
            resultado = a;
        } else if (b > a){
            resultado = b;
        } else {
            resultado = c;
        }
        return resultado;
        
        
//        Otra solución para máximo ( , , )
//        
//        static int maximo (int a, int b, int c){
//        int
//        resultado = maximo (maximo(a, b), c);
//        return resultado;
//        }
        
    }
    
}




