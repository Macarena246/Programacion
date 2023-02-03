/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.patinetes;

/**
 *
 * @author Macarena
 */
public class Patinete {
    
    /*De cada patinete interesa saber su id, modelo, marca,  color (gris, amarillo o azul) y potencia.*/
    
    String id;
    String modelo;
    String marca;
    int potencia;
    public ColorPatinete color;
    
    public enum ColorPatinete {GRIS, AMARILLO, AZUL}
    
    public Patinete (String id, String modelo, String marca, int potencia, ColorPatinete color){
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
        this.color = color;
        
    }
    
}
