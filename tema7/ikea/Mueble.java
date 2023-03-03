/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ikea;

/**
 *
 * @author Macarena
 */

/*Luego, deberás crear tres clases concretas que hereden de "ProductoHogar": "Mueble", "ArticuloDeDecoracion" y "Electrodomestico". La clase "Mueble" deberá tener un atributo adicional llamado "tipoDeMueble".*/
public class Mueble extends ProductoHogar{
    
    private TipoMueble tipoMueble;
    
    
    //Constructor por defecto:
    public Mueble(){
        
    }
    
    
    //Constructor con parámetros:
    public Mueble(String nombre, String descripcion, double precio, Material tipo, TipoMueble tipoMueble){
        super(nombre, descripcion, precio, tipo);
        
        this.tipoMueble = tipoMueble;
    }
    
    
    //Getters y setters:
    public TipoMueble getTipoMueble() {
        return tipoMueble;
    }

    public void setTipoMueble(TipoMueble tipoMueble) {
        this.tipoMueble = tipoMueble;
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
