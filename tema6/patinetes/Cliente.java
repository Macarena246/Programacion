/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.patinetes;

/**
 *
 * @author Macarena
 */
public class Cliente {
    
    /*Cuando un cliente compra un patinete, se le hace una ficha en la tienda
    con la siguiente información: DNI, nombre, apellidos, dirección, patinete y teléfono.*/
    
    String dni;
    String nombre;
    String apellidos;
    String direccion;
    String telefono;
    Patinete patinete;
    
    public Cliente (String dni, String nombre, String apellidos, String direccion, String telefono, Patinete patinete){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.patinete = patinete;
        
    }
}
