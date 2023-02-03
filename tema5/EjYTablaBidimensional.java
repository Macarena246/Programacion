/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Arrays;

/**
 *
 * @author Macarena
 */
public class EjYTablaBidimensional {

    /*Crear una tabla bidimensional de longitud 5 x 5 y rellenarla de la
    siguiente forma: el elemento de la posición [n][m] debe contener el valor 10 x (n + m).
    Después se debe mostrar su contenido.*/
    
    
    public static void main(String[] args) {

        int[][] bidimensional = new int[5][5];

        for (int n = 0; n < bidimensional.length; n++) {

            for (int m = 0; m < bidimensional.length; m++) {
                bidimensional[n][m] = 10 * (n + m);
            }
        }

        System.out.println(Arrays.deepToString(bidimensional));
    }
}
