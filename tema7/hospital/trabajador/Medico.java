/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospital.trabajador;

/**
 *
 * @author Macarena
 */
public class Medico extends Trabajador {
    
    /*Los médicos pueden ser de diferentes especialidades como cardiólogos, pediatras, cirujanos, entre otros.
    Además de los atributos mencionados anteriormente cada médico tiene un número de colegiado y un número de pacientes que ha atendido.*/
    
    private Especialidad especialidad;
    private int numcolegiado;
    private int paciente;
    
    
    //Constructos por defecto:
    public Medico(){
        
    }
    
    
    //Constructor con parámetros:
    public Medico(String nombre, int id, double sueldo, Especialidad especialidad, int numcolegiado, int paciente){
        super(nombre, id, sueldo);
        this.especialidad = especialidad;
        this.numcolegiado = numcolegiado;
        this.paciente = paciente;
    }
    
    
    //Getters y setters:

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public int getNumcolegiado() {
        return numcolegiado;
    }

    public int getPaciente() {
        return paciente;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setNumcolegiado(int numcolegiado) {
        this.numcolegiado = numcolegiado;
    }

    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }
    
    
    //Método mostar especialidad:
   public void mostrarEspecialidad(){
       
   }
    
}
