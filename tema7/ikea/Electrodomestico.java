/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ikea;

/**
 *
 * @author Macarena
 */

/*La clase "Electrodomestico" deberá tener un atributo adicional llamado "eficienciaEnergetica".*/
public class Electrodomestico extends ProductoHogar{
    
    private Eficiencia eficienciaEnergetica;
    
    
    //Constructor por defecto:
    public Electrodomestico(){
        
    }
    
    
    //Constructor con parámetros:
    public Electrodomestico(String nombre, String descripcion, double precio, Material tipo, Eficiencia eficienciaEnergetica){
        super(nombre, descripcion, precio, tipo);
        
        this.eficienciaEnergetica = eficienciaEnergetica;
    }
    
    
    //Getters y setters:

    public Eficiencia getEficienciaEnergetica() {
        return eficienciaEnergetica;
    }

    public void setEficienciaEnergetica(Eficiencia eficienciaEnergetica) {
        this.eficienciaEnergetica = eficienciaEnergetica;
    }
    
}
