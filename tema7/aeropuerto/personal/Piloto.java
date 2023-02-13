/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.aeropuerto.personal;

/**
 *
 * @author Macarena
 */
public class Piloto extends Personal {
    
    /*Los pilotos se caracterizan por un rango (Alpha, Tango o Águila), un sueldo y si realizan vuelos internacionales o no.*/

    
    double sueldo;
    public Rango rango;
    boolean vueloInternacional;

    public enum Rango {
        ALPHA, TANGO, AGUILA
    };
    
    
    //Constructor por parámetros:
    
    public Piloto(String nombre, String apellidos, String dni, String mail, double sueldo, Rango rango, boolean vueloInternacional){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.mail = mail;
        this.sueldo = sueldo;
        this.rango = rango;
        this.vueloInternacional = vueloInternacional;
    }
    
    //Getters y setters:

    public double getSueldo() {
        return sueldo;
    }

    public Rango getRango() {
        return rango;
    }

    public boolean isVueloInternacional() {
        return vueloInternacional;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    public void setVueloInternacional(boolean vueloInternacional) {
        this.vueloInternacional = vueloInternacional;
    }
    
}
