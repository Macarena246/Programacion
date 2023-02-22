/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.empleado;

/**
 *
 * @author Macarena
 */
public class Empleado {
    
    /*Codifica la siguiente jerarquía de clases representada por este diagrama UML:
    
        La clase base es la clase Empleado. Esta clase contiene:
        -Un atributo privado nombre de tipo String que heredan el resto de clases.
        -Un constructor por defecto.
        -Un constructor con parámetros que inicializa el nombre con el String que recibe.
        -Método set y get para el atributo nombre.
        -Un método toString() que devuelve el String: "Empleado " + nombre.*/
    
    
    //Atributo privado nombre:
    protected String nombre;
    
    
    //Constructor por defecto:
    public Empleado(){
        
    }
    
    
    //Constructor por parámetros:
    public Empleado(String nombre){
        this.nombre = nombre;
    }
    
    
    //Método set y get para el atributo nombre:
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    
    @Override
    
    public String toString(){
        return "Empleado " + nombre;
    }
}
