/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ikea;

/**
 *
 * @author Macarena
 */
public class ArticuloDecoracion extends ProductoHogar{
    
    //Constructor por defecto:
    public ArticuloDecoracion(){
        
    }
    
    
    //Constructor con parámetros:
    public ArticuloDecoracion(String nombre, String descripcion, double precio, Material tipo){
        super(nombre, descripcion, precio, tipo);
    }
    
    
    //Getters y setters:
    public Material getTipo() {
        return tipo;
    }

    public void setTipo(Material tipo) {
        this.tipo = tipo;
    }
    
}
