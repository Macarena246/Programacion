/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospital.trabajador;

/**
 *
 * @author Macarena
 */
public class Trabajador {
    
    /*En un hospital se han desarrollado diferentes tipos de trabajadores que tienen funciones específicas en la organización.
    Estos trabajadores se clasifican en dos categorías: médicos y no médicos. Cada trabajador tiene un nombre,
    un número de identificació y un sueldo.*/
    
    
    protected String nombre;
    protected int id;
    protected double sueldo;
    
    //Constructor por defecto:
    public Trabajador(){
        
    }
    
    
    //Constructor con parámetros:
    public Trabajador(String nombre, int id, double sueldo){
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }
    
    
    //Getters y setters:
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    

    
    
    
    
}
