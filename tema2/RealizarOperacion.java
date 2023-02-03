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
public class RealizarOperacion {
    
/*Ingresar 2 números y luego un carácter indicando la operación a realizar (+,-,*,/)
    y reportar el resultado de la operación.*/
    
    public static void main (String [] args){
        
        Scanner numero= new Scanner(System.in);
        System.out.println("Ingresa dos números: ");
        double a= numero.nextDouble();
        double b= numero.nextDouble();
        System.out.println("Indique el operador que va a utilizar (+,-,*,/): ");
        char operador=numero.next().charAt(0); 
        /*Se pone "char" antes de "operador" y sirve para referirnos a un solo carácter (+,-,*,/)
        y depués del igual (=) se pone el nombre que he utilizado para nombrar el Scanner ("numero"),
        que es quien lee los números.*/
        
        switch (operador){
        
            case '+':
                System.out.println("El resultado es: "+ (a+b));
                break;
            case '-':
                System.out.println("El resultado es: "+ (a-b));
                break;
            case '*':
                System.out.println("El resultado es: "+ (a*b));
                break;
            case '/':
                System.out.println("El resultado es: "+ (a/b));
                break;
            default:
                System.out.println("No ha introducido uno de los operadores indicados.");
        }
      
    }    
}
