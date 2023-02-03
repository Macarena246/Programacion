/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.autoescuela;

/**
 *
 * @author Macarena
 */
public class Alumno {
    
    //Cada alumno tiene un nombre, un DNI y el tipo de carnet que quiere obtener.
    
    String nombre;
    String dni;
    String carnet;
    
    public Alumno (String nombre, String dni, String carnet){
        
        this.nombre = nombre;
        this.dni = dni;
        this.carnet = carnet;
        
    }
    
    String mostrarDNI(){
      return dni;  
    }
    
}
