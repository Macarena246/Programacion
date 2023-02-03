/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author Macarena
 */
public class Ej2FuncionEco {

    /*Diseñar la función eco() a la que se le pasa como parámetro de un número n,
    y muestra por pantalla n veces el mensaje "Eco..."*/
    
    static void eco(int nveces) {
        for (int i = 0; i < nveces; i++) {
            System.out.println("Eco...");
        }
    }
    
    public static void main(String[] args) {
        eco(5);
    }
}
