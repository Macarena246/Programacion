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
public class MultiplodeOtro {
    
    /*Pedir dos números y que nos salga si es múltiplo.*/
    
    public static void main (String [] args){
    
        Scanner numero= new Scanner (System.in);
        System.out.println("Introduce dos número: ");
        int a= numero.nextInt();
        int b= numero.nextInt();
        boolean multiplo= a%b==0;
        System.out.println("¿Es el primero múltiplo del segundo?: " +multiplo);
    
    }
}
