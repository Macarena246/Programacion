/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospitalabstracto.trabajador;

/**
 *
 * @author Macarena
 */

//Clase abstracta para médico cirujano:
abstract class Cirujano extends Medico{
    
    //Constructor por defecto:
    public Cirujano(){
        
    }
    
    
    //Constructor con parámetros:
    public Cirujano(String nombre, int id, int paciente){
        super(nombre, id, Especialidad.CIRUJANO, paciente);
    }
    
    
    //Método para calcular sueldo
    @Override
    public void calcularSueldo(){
        sueldo = 3000 + paciente * 25;
    }
}
