/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author Macarena
 */
public class Ej19Abecedario {

    /*Mostrar el abcedario en decremento (como el ejercicio del triángulo)*/
    
    public static void main(String[] args) {

        for (char i = 'Z'; i >= 'A'; i--) {

            for (char j = i; j >= 'A'; j--) {

                System.out.print(j);
            }   
        System.out.println("");
        }
    }
}
