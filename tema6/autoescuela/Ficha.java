/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.autoescuela;

/**
 *
 * @author Macarena
 */
public class Ficha {
    
    /*Una Ficha de Autoescuela tiene un profesor, un alumno y un coche de prácticas.
    Cada profesor tiene un nombre, un DNI y un sueldo.
    Cada alumno tiene un nombre, un DNI y el tipo de carnet que quiere obtener.
    Cada coche tiene una matrícula, una marca y un modelo.
    Crea la clase Ficha, Profesor, Alumno y Coche.

    Crea en un Test una Ficha y prueba a mostrar el DNI del alumno y la matrícula del coche.*/
    
    
    
    private Profesor prof;
    private Alumno alum;
    private Coche car;
    
    public Ficha(Profesor prof, Alumno alum, Coche car){
        
        this.prof = prof;
        this.alum = alum;
        this.car = car;
    }
    
    String mostrarDNIalumno(){
        return alum.mostrarDNI();
    }
    
    String mostrarMatriculaCoche(){
        return car.mostrarMatricula();
    }
        
}
