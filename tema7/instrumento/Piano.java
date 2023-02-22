/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.instrumento;

/**
 *
 * @author Macarena
 */
public class Piano extends Instrumento{

    @Override
    public void interpretar() {
        for(Nota nota : notas){
            System.out.println(nota);
        }
        System.out.println("Interpretado en un piano");
    }
    
}
