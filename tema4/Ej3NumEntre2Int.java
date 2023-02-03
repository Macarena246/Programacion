/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author Macarena
 */
public class Ej3NumEntre2Int {
    
    /*Escribir una función a la que se le pasen dos enteros y muestre todos
    los números comprendidos entre ellos.*/
    
    static void entero (int num1, int num2) {
        for (int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
       entero(10,50);
    }
}
