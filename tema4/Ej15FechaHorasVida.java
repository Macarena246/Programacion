/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej15FechaHorasVida {

    /*Crear una función a la que “le pasemos” nuestra fecha de nacimiento y nos
    diga el número de horas que llevamos vividas.*/
    
    
    public static void main(String[] args) {

        System.out.println((horasVivo(25, 2, 2002)));

    }

    public static int horasVivo(int dia, int mes, int anno) {

        int resultado, dias;
        LocalDateTime fecha = LocalDateTime.now();
        int day = fecha.getDayOfYear();
        int year = fecha.getYear();

        int edad = (year - anno) * 365;
        if (mes != 1) {
            dias = (mes - 1) * 30 + dia;
        } else {
            dias = dia;
        }
        resultado = edad * 24 - dias * 24 + day * 24;

        return resultado;
    }

}
