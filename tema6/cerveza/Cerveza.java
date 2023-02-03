/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.cerveza;

/**
 *
 * @author Macarena
 */
public class Cerveza {
    
    String marca;
    int codigo;
    double precio;
    double grados;
    String tipo;
    
    void beber (){
        System.out.println("Estoy bebiéndome una cerveza " + marca + " bien freskita.");
    }
    
    double subidaPrecio (double subida){
        return precio += subida;
    }
    
    
}
