/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.biblioteca;

/**
 *
 * @author Macarena
 */
public class TestLibro {
    
    /*Método toString para mostrar los datos de los libros. 
      Escribe un programa para probar el funcionamiento de la clase Libro.*/
    
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("Mi isla", "Elísabet Benavent", 1000, 250);
        Libro libro2 = new Libro("Cómo hacer que nos pasen cosas buenas", "Marian Rojas Estapé", 500, 32);
        Libro libro3 = new Libro("El humor de mi vida", "Paz Padilla", 3400, 630);
        
        System.out.println(libro1.getAutor());
        System.out.println(libro2.getEjemplares());
        System.out.println(libro1.getPrestados());
        libro2.setAutor("Manolo Lama");
        System.out.println(libro2.getAutor());
        System.out.println(libro3.toString());
        
    }
    
}
