/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospitalabstracto.trabajador;


/**
 *
 * @author Macarena
 */

//Clase abstracta trabajador no médico:
abstract class NoMedico extends Trabajador{
    
    protected Area area;
    
    
    //Constructor por defecto:
    public NoMedico(){
        
    }
    
    
    //Constructor con parámetros:
    public NoMedico(String nombre, int id, Area area){
        super(nombre, id);
        this.area = area;
    }
    
    
    //Getters y setters:
    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
    
    
    //Método para calcular sueldo:
    @Override
    public void calcularSueldo(){
        sueldo = 1600;
    }
}
