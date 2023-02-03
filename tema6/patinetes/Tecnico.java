/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.patinetes;

import java.util.Date;

/**
 *
 * @author Macarena
 */
public class Tecnico {
    
    /*Los técnicos tienen un DNI, nombre, apellidos, fecha de contratación y salario.*/
    
    String dni;
    String nombre;
    String apellidos;
    Date fechaContrato;
    double salario;
    
    public Tecnico (String dni, String nombre, String apellidos, Date fechaContrato, double salario){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaContrato = fechaContrato;
        this.salario = salario;
    }
    
    
}
