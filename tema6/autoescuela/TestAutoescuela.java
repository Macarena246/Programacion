/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.autoescuela;

/**
 *
 * @author Macarena
 */
public class TestAutoescuela {
    
    //Crea en un Test una Ficha y prueba a mostrar el DNI del alumno y la matrícula del coche.
    
    public static void main(String[] args) {
        
        Profesor p = new Profesor ("Manolo", "12345678 M", 1500);
        Alumno a = new Alumno ("Pepe", "12121212 L", "B1");
        Coche c = new Coche ("Dacia","Sandero","1234 LPM");
        Ficha f = new Ficha (p, a, c);
        
        System.out.println("El DNI del alumno es " + f.mostrarDNIalumno());
        System.out.println("La matrícula del coche es " + f.mostrarMatriculaCoche());
        
    }
    
}
