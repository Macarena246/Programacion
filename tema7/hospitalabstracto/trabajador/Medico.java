/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospitalabstracto.trabajador;

import tema7.hospitalabstracto.trabajador.Especialidad;

/**
 *
 * @author Macarena
 */

//Clase abstracta trabajador médico:
abstract class Medico extends Trabajador {
    
    protected Especialidad especialidad;
    protected int paciente;
    
    
    //Constructor por defecto:
    public Medico(){
        
    }
    
    
    //Constructor con parámetros:
    public Medico(String nombre, int id, Especialidad especialidad, int paciente){
        super(nombre, id);
        this.especialidad = especialidad;
        this.paciente = paciente;
    }
    
    
    //Getters y setters:

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public int getPaciente() {
        return paciente;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }
    
    
    
    //Método para calcular sueldo:
    @Override
    public abstract void calcularSueldo();
    
}
