/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.SimulacroPrueba;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej13TablasAlumnos {
    
    /*Crear dos tablas con misma longitud. En una almacenar los nombres
    de una serie de alumnos, y en otra sus notas de Programación. Devolver el nombre
    del alumno/a con mayor nota.*/
    
    
    static String alumnos (String nombre[], int nota[]){
        
        //objetivo: saber la POSICION del elemento de nota que contiene la mayor nota (segun el main: 2)
        String res;
        
        int posicionMayor = 0;
        int mayor = 0;
        for (int i = 0; i < nombre.length; i++){
            if (nota[i] > mayor){
                mayor = nota[i];
                posicionMayor = i;
            }
        }
        res = nombre[posicionMayor];
        return res;
    }
    
    
    public static void main(String[] args) {
        
        String[] alumnado= {"Thiago","Mateo","Ciro","Leo"};
        int[] notas = {4,6,8,2};
        
        String mejor = alumnos(alumnado, notas);
        System.out.println(mejor);
    }
}
