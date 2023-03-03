/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ikea;

/**
 *
 * @author Macarena
 */

/*Luego, deberás crear una clase abstracta llamada "ProductoHogar" que herede de "Producto" y que contenga un atributo adicional llamado "tipoDeMaterial".*/
abstract class ProductoHogar extends Producto{
    
    protected Material tipo;
    
    
    //Constructor por defecto:
    public ProductoHogar(){
        
    }
    
    
    //Constructor con parámetros:
    public ProductoHogar(String nombre, String descripcion, double precio, Material tipo){
        super (nombre, descripcion, precio);
        
        this.tipo = tipo;
    }
    
    
    //Getters y setters:

    public Material getTipo() {
        return tipo;
    }

    public void setTipo(Material tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString();
  }
    
    
}
