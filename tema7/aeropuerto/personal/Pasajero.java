/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.aeropuerto.personal;

/**
 *
 * @author Macarena
 */
public class Pasajero extends Personal {
    
    /*Los pasajeros no tienen un sueldo, pero tienen un número de pasaporte.*/
    
    String pasaporte;
    
    //Constructor por parámetros:
    
    public Pasajero(String nombre, String apellidos, String dni, String mail, String pasaporte){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.mail = mail;
        this.pasaporte = pasaporte;
    }
    
    
    //Getters y setters:

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }
  
    
    //Método mostrar pasajero:
    
    public void mostrarPasajero(){
        System.out.println(nombre + " " + apellidos + " con DNI " + dni + ", Pasaporte: " + pasaporte + " y correo: " + mail);
    }
}
