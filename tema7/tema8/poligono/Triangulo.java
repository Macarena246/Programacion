/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.poligono;

/**
 *
 * @author Macarena
 */
public class Triangulo implements Area{
    
    private double lado;
    public Triangulo(double lado){
        this.lado = lado;
    }
    
    public double calcularArea(double lado){
        lado = this.lado;
        return (Math.sqrt(3)/4 * lado * lado);
    }
}
