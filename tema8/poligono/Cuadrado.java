/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.poligono;

/**
 *
 * @author Macarena
 */
public class Cuadrado implements Area{
    
    private double lado;
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(double lado){
        return lado * lado;
    }
    
}
