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
public class MayorAMenor {
    
    /*Pedir tres números y mostrarlos ordenados de mayor a menor*/
    
    public static void main (String [] args) {
        
        Scanner numeros= new Scanner (System.in);
        System.out.println("Introduzca tres números: ");
        double a= numeros.nextDouble();
        double b= numeros.nextDouble();
        double c= numeros.nextDouble();
        
        System.out.println ("El orden de mayor a menor es: ");
        if (a>b && a>c && b>c){
        System.out.println (" "+a+ ", " +b+ ", " +c+ " ");
        }
        else if (a>b && a>c && c>b ){
        System.out.println(" "+a+ ", " +c+ ", " +b+ " ");
        }
        else if (b>a && b>c && a>c){
        System.out.println(" "+b+ ", " +a+ ", " +c+ " ");
        }
        else if (b>a && b>c && c>a){
        System.out.println(" "+b+ ", " +c+ ", " +a+ " ");
        }
        else if (c>a && c>b && a>b){
        System.out.println(" "+c+ ", " +a+ ", " +b+ " ");
        }
        else if (c>a && c>b && b>a){
        System.out.println (" "+c+ ", " +b+ ", " +a+ " ");
        }
}
}