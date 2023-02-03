/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author Macarena
 */
public class Ej4AreaVolCilindro {
    
    /*Realizar una función que calcule y muestre el área o el volumen de un cilindro,
    según se especifique. Para distinguir un caso de otro se le pasará como opción
    un número: 1 para el área, 2 para el volumen.
    Además hay que pasarle a la función el radio de la base y la altura.
    area = 2pi * radio * (altura + radio)
    volumen = pi * radio^2 * altura*/
    
    static void areaVol (int opcion, double radio, double altura){
        
        if (opcion == 1){
            
            double area = 2 * Math.PI * radio * (altura + radio);
            System.out.println("El área es: " + area);
        }
        else if (opcion == 2){
            double volumen = Math.PI * Math.pow(radio, 2) * altura;
            System.out.println("El volumen es: " + volumen);
        }
    }
    
    public static void main(String[] args) {
        
        areaVol(1, 5.4, 6);
        areaVol (2, 5.4, 6);
    }
}
