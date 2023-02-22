/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hora;

/**
 *
 * @author Macarena
 */
public class Test {
    
    public static Hora horaActual = new Hora(12, 30);
    
    public static void main(String[] args) {
        System.out.println(horaActual);
        horaActual.inc();
        System.out.println(horaActual);
        horaActual.setMinutos(45);
        System.out.println(horaActual);
        horaActual.setHora(14);
        System.out.println(horaActual);
        horaActual.setHora(26);
        System.out.println(horaActual);
    }
    
}
