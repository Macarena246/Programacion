/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ikea;

/**
 *
 * @author Macarena
 */

/*Crear en un tipo test la estantería KALLAX y el flexo FORSÅ*/
public class TestTienda {
    
    public static void main(String[] args) {
        Mueble producto1 = new Mueble("KALLAX", "KALLAX es una elegante estantería de almacenaje que da para mucho. Colócala en el suelo, móntala en una pared o conviértela en un escritorio para transformar tu salón.", 99.99, Material.MADERA, TipoMueble.ESTANTERIA);
        Mueble producto2 = new Mueble("FORSÅ", "Lámpara flexo de trabajo, niquelado.", 14.99, Material.METAL, TipoMueble.FLEXO);
        Mueble [] productos = {producto1, producto2};
        Tienda tienda = new Tienda(productos);
        tienda.mostrarProductos();
    }
    
}
