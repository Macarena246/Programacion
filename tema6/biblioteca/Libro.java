/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.biblioteca;

/**
 *
 * @author Macarena
 */
public class Libro {
    
    /*Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca.
    La clase debe guardar el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados.
    La clase contendrá los siguientes métodos:
    Constructor por defecto. -hecho
    Constructor con parámetros. -hecho
    Métodos Setters/getters -hecho
    Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. -hecho
    No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. -hecho
    Devuelve true si se ha podido realizar la operación y false en caso contrario. -hecho
    Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. -hecho
    No se podrán devolver libros que no se hayan prestado. -hecho
    Devuelve true si se ha podido realizar la operación y false en caso contrario. -hecho */
    
    String titulo;
    String autor;
    int ejemplares;
    int prestados;
    
    public Libro(){ //Constructor por defecto
        
    }
    
    public Libro (String titulo, String autor, int ejemplares, int prestados){ //Constructor con parámetros
        
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
        
    }
    
    //Getters
    public String getTitulo (){
        return this.titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public int getEjemplares(){
        return this.ejemplares;
    }
    
    public int getPrestados(){
        return this.prestados;
    }
    
    
    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setEjemplares(int ejemplares){
        this.ejemplares = ejemplares;
    }
    
    public void setPrestados(int prestados){
        this.prestados = prestados;
    }
    
    public boolean prestamo(){
        boolean res = false;
        if(ejemplares >= prestados){
            this.prestados++;
            res = true;
        }
        
        return res;
    }
    
    public boolean devolucion(){
        boolean res = true;
        if(prestados == 0){
            res = false;
        }
        
        ejemplares++;
        return res;
    }
    
    public String toString(){
        return titulo + ", " + autor + ", " + ejemplares + ", " + prestados;
    }
    
}
