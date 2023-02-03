/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.calendario;

/**
 *
 * @author Macarena
 */
public class TestCalendario {
    
    public static void main(String[] args) {
        Calendario c1 = new Calendario(28,12,1992);
        Calendario c2 = new Calendario(25,02,2002);
        System.out.println(c1.mostrar());
        System.out.println(c2.mostrar());

        c1.iguales(c2);
    }
    
}
