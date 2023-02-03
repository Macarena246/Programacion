/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1;

/**
 *
 * @author Macarena
 */
public class AreaCirculo {
    
    /*Calcular el área de un círculo cuyo diámetro es nuestra edad.*/
    
    public static void main(String[] args){
        
        final double PI=3.14159265;
        double diametro=20;
        double radio=diametro/2;
        double area;
        area=PI*(radio*radio);
        System. out. println ("El área del círculo cuyo radio es " + radio + " es " + area);
        
    }
}
