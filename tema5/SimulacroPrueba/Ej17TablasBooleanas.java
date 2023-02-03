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
public class Ej17TablasBooleanas {
    
    /*Crear una tabla rellena de tres tablas de booleans.*/
    
    static void tresTablas(boolean tabla1[], boolean tabla2[], boolean tabla3[]){
        
        boolean tabla4 [] [] = {tabla1, tabla2, tabla3};
        
        System.out.println(Arrays.deepToString(tabla4));
    }
    
    public static void main(String[] args) {
        
        boolean tabla1 [] = {true, false, true};
        boolean tabla2[] = {false, false, false};
        boolean tabla3[] = {true, true, true};
        
        tresTablas (tabla1, tabla2, tabla3);
    }
}
