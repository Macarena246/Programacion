/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ikea;

/**
 *
 * @author Macarena
 */

/*Deberás crear una clase abstracta llamada "Producto" que contenga los siguientes atributos: nombre, descripción y precio.*/
abstract class Producto {
    
    protected String nombre;
    protected String descripcion;
    protected double precio;
    
    
    //Constructor por defecto:
    public Producto(){
        
    }
    
    
    //Constructor con parámetros:
    public Producto(String nombre, String descripcion, double precio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
   //Getters y setters:

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    @Override
    public String toString(){
        return nombre + " " + precio + "€." + " - " + descripcion;
    }
}
