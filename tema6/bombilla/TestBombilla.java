/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.bombilla;

/**
 *
 * @author Macarena
 */
public class TestBombilla {
    
    public static void main(String[] args) {
        
        Bombilla b1, b2;
        b1 = new Bombilla();
        b2 = new Bombilla();
        
        b1.encendida();
        b2.apagada();
        
        System.out.println("b1: " + b1.mostrarEstado());
        System.out.println("b2: " + b2.mostrarEstado());
        
        Bombilla.interruptor = false;
        System.out.println("Cortamos la luz general");
        System.out.println("b1: " + b1.mostrarEstado());
        System.out.println("b2: " + b2.mostrarEstado());
        
        Bombilla.interruptor = true;
        System.out.println("Activamos la luz general");
        System.out.println("b1: " + b1.mostrarEstado());
        System.out.println("b2: " + b2.mostrarEstado());
        
    }
    
}
