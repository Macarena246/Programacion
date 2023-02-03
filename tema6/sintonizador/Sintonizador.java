/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.sintonizador;

/**
 *
 * @author Macarena
 */
public class Sintonizador {
    
    /*Definir una clase que permita controlar un sintonizador digital de emisoras FM; concretamente, se desea dotar
      al controlador de una interfaz que permita subir (up) o bajar (down) la frecuencia (en saltos de 0,5 MHz) y
      mostrar la frecuencia sintonizada en un momento dado (display). Supondremos que el rango de frecuencias
      para manejar oscila entre los 80 MHz y los 108 MHz y que, al inicio, el controlador sintonice la frecuencia
      indicada en el constructor o 80 MHz por defecto. Si durante una de subida o bajada se sobrepasa uno de los dos
      límites, la frecuencia sintonizada debe pasar a ser la del extremo contrario. Escribir un pequeño programa
      principal para probar su funcionamiento.*/
    
    private double frecuencia;
    
    Sintonizador(double frecuenciaInicial){
        if(frecuenciaInicial < 80){
            frecuencia = 80;
        }else if (frecuenciaInicial > 108){
            frecuencia = 108;
        } else{
            frecuencia = frecuenciaInicial;
        }
        
    }
    
    Sintonizador(){
        this.frecuencia = 80.0;
    }
    
    public double down(){
        this.frecuencia -= 0.5;
        ComprobarRango();
        
        return (frecuencia);
    }
    
    public double up(){
        this.frecuencia += 0.5;
        ComprobarRango();
        
        return (frecuencia);
    }
    
    
    public String display (){
        return ("Sintonizador: " + frecuencia + " MHz.");
    }
    
    
    private void ComprobarRango(){
        
        if (frecuencia < 80){
            frecuencia = 108;
        }else if(frecuencia > 108){
            frecuencia = 80;
        }
    }
}
