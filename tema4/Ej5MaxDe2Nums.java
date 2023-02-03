/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author Macarena
 */
public class Ej5MaxDe2Nums {

    /*Diseñar una función que reciba dos números enteros y devuelve el máximo
de ambos.*/
    
    
    static int maximo(int a, int b) {
        
        int resultado;
        if (a > b) {
            resultado = a;
        } else {
            resultado = b;
        }
        
        return resultado;
    }

    public static void main(String[] args) {

        int max = maximo(12, 24);
        System.out.println(max);
    }
    
}
