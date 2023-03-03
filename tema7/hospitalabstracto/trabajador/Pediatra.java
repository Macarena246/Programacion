/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospitalabstracto.trabajador;

/**
 *
 * @author Macarena
 */

//Clase abstracta para médico pediatra:
abstract class Pediatra extends Medico{
    
    //Constructor por defecto:
    public Pediatra(){
        
    }
    
    
    //Constructor con parámetros:
    public Pediatra(String nombre, int id, int paciente){
        super(nombre, id, Especialidad.PEDIATRA, paciente);
    }
    
    
    //Método para calcular sueldo:
    @Override
    public void calcularSueldo(){
        sueldo = 1800 + paciente * 40;
    }
}
