/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.SimulacroPrueba;

import java.util.Arrays;

/**
 *
 * @author Macarena
 */
public class Ej2OrdenarTablaMenMay {

    /*Ordenar la siguiente tabla de menor a mayor: [5, 7, 8, 4, 3, 6, 0, 0, 8, 1]*/

    static void ordena (int tabla[]){
        
        System.out.println(Arrays.toString(tabla));
        Arrays.sort(tabla);
        System.out.println(Arrays.toString(tabla));
    }
    
    public static void main(String[] args) {
        
        int t [] = {5, 7, 8, 4, 3, 6, 0, 0, 8, 1};
        ordena (t);
        
    }
}
