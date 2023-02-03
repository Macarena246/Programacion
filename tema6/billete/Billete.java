/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.billete;

import java.util.Random;

/**
 *
 * @author Macarena
 */
public class Billete {
    
    /*El profesor ha escondido todos sus ahorros (20€) en uno de los sitios de una clase de 8 filas por 4 columnas.
    Desarrolla un programa en Java que dibuje las coordenadas X e Y del billete (“€”) de manera aleatoria empleando
    una tabla bidimensional.*/
    
    public static void main(String[] args) {
        
        int filasX = 8;
        int columnasY = 4;
        int [][] clase = new int [filasX] [columnasY];
        Random num = new Random();
        int x = num.nextInt(filasX);
        int y = num.nextInt(columnasY);
        clase [x][y] = 20;
        System.out.println("El billete está en la fila " + x + " y columna " + y + ".");
        
    }
}
