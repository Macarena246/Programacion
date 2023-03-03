/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ikea;

/**
 *
 * @author Macarena
 */

/*Finalmente, deberás crear una clase llamada "Tienda" que tenga un atributo llamado "productos" que sea un array de objetos
de la clase "Producto". La clase "Tienda" deberá tener un método llamado "agregarProducto" que permita agregar un producto
al arreglo de productos. La clase "Tienda" deberá tener otro método llamado "mostrarProductos" que muestre en pantalla todos
los productos que hay en la tienda, junto con sus características.*/
public class Tienda {
    
    private Producto[] productos = new Producto[0];
    private int numProductos;
    
    //Constructor por defecto:
    public Tienda(){
        
    }
    
    
    //Constructor con parámetros:
    public Tienda(Producto[] productos){
        this.productos = productos;
    }
    
    
    //Getters y setters:

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    
    
    
    //Método para agregar producto:
    public void agregarProducto(Producto producto){
        if (numProductos < productos.length){
            productos[numProductos] = producto;
            numProductos++;
        }else{
            System.out.println("Error: no hay espacio en la tienda para agregar otro producto.");
        }
    }
    
    
    //Método para mostrar productos:
    public void mostrarProductos(){
        System.out.println("Productos en la tienda: ");
        for(int i = 0; i < productos.length; i++){
            System.out.println(productos[i]);
        }
    }
}
