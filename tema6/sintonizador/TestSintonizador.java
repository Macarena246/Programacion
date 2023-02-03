/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.sintonizador;

/**
 *
 * @author Macarena
 */
public class TestSintonizador {
    
    public static void main(String[] args) {
        
        Sintonizador a, b;
        
        a = new Sintonizador (107);
        a.up(); a.up(); a.up(); a.up();
        System.out.println(a.display());
        
        b = new Sintonizador (80.5);
        b.down(); b.down(); b.down();
        System.out.println(b.display());
        
        a = new Sintonizador (200);
        System.out.println(a.display());
    }
    
}
