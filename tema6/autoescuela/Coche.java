/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.autoescuela;

/**
 *
 * @author Macarena
 */
public class Coche {
    
    //Cada coche tiene una matrícula, una marca y un modelo.
    
    String matricula;
    String marca;
    String modelo;
    
    public Coche (String marca, String modelo, String matricula){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        
    }
    
    String mostrarMatricula (){
        return matricula;
    }
}
