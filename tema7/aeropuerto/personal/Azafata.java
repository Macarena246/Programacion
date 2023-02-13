/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.aeropuerto.personal;

import java.util.Arrays;

/**
 *
 * @author Macarena
 */
public class Azafata extends Personal {    
    /*Los azafatos y azafatas también tienen un sueldo y una lista de idiomas que hablan.*/
    
    
    double sueldo;
    Idioma [] idioma;
    
    public enum Idioma{INGLES, FRANCES, ITALIANO, ALEMAN, CHINO, RUSO};
    
    
    //Constructor por parámetros:
    
    Azafata(String nombre, String apellidos, String dni, String mail, double sueldo, Idioma[] idioma){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.mail = mail;
        this.sueldo = sueldo;
        this.idioma = idioma;
    }
    
    
    //Getters y setters:

    public double getSueldo() {
        return sueldo;
    }

    public Idioma[] getIdioma() {
        return idioma;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setIdioma(Idioma[] idioma) {
        this.idioma = idioma;
    }
    
}
