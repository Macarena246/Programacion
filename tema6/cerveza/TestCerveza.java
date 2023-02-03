/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.cerveza;

/**
 *
 * @author Macarena
 */
public class TestCerveza {
    
    public static void main(String[] args) {
        
        Cerveza c = new Cerveza();
        c.marca = "Cruzcampo";
        c.grados = 4.8;
        c.precio = 1.20;
        c.tipo = "Pilsen";
        c.codigo = 1234;
        
        c.beber();
        double aumento = c.subidaPrecio(2);
        System.out.println("Ahora cuesta " + aumento + " €. K cara con to su puta madre...");
    }
    
}
