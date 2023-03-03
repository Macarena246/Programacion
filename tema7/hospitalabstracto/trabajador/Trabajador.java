/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospitalabstracto.trabajador;

/**
 *
 * @author Macarena
 */

//Clase abstracta trabajador hospital:
abstract class Trabajador {
    
    protected String nombre;
    protected int id;
    protected double sueldo;
    
    
    //Constructor por defecto:
    public Trabajador(){
        
    }
    
    
    //Constructor con parámetros:
    public Trabajador(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }
    
    
    //Getters y setters:

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    
    //Método para calcular sueldo:
    public abstract void calcularSueldo();
    
    
    //Método para mostrar sueldo:
    public void mostrarSueldo(){
        System.out.println("El sueldo de " + nombre + " es de " + sueldo);
    }
            
}
