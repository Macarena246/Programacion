/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospitalabstracto.trabajador;

/**
 *
 * @author Macarena
 */

//Clase abstracta para médico cardiólogo:
abstract class Cardiologo extends Medico{
    
    //Constructor por defecto:
    public Cardiologo(){
        
    }
    
    
    //Constructor con parámetros:
    public Cardiologo(String nombre, int id, int paciente){
        super(nombre, id, Especialidad.CARDIOLOGO, paciente);
    }
    
    
    
    //Método para calcular sueldo:
    @Override
    public void calcularSueldo(){
        sueldo = 2500 + paciente * 50;
    }
    
}
