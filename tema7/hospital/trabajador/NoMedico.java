/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospital.trabajador;

/**
 *
 * @author Macarena
 */
public class NoMedico extends Trabajador{
    
    /*Por otro lado, los trabajadores no médicos pueden ser enfermeros, recepcionistas, limpiadores, entre otros.
    Cada trabajador no médico tiene un área de trabajo asignada, además de los atributos mencionados anteriormente.*/
 
    private Area area;
    
    
    //Constructor por defecto:
    public NoMedico(){
        
    }
    
    //Constructor con parámetros:
    public NoMedico(String nombre, int id, double sueldo, Area area){
        super(nombre, id, sueldo);
        this.area = area;
    }
    
    
    //Getters y setters:

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    
}
