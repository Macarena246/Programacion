/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.bombilla;

/**
 *
 * @author Macarena
 */
public class Bombilla {
    
    /*Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o apagar
      individualmente. Para ello, hacer una clase Bombilla con una variable privada que indique si está encendida o
      apagada, así como un método que nos diga el estado de una bombilla concreta. Además, queremos poner un interruptor
      general, de forma que si este se apaga, todas las bombillas quedan apagadas. Cuando el interruptor general se activa,
      las bombillas vuelven a estar encendidas o apagadas, según estuvieran antes. Cada bombilla se enciende y se apaga
      individualmente, solo responde que está encendida si su interruptor particular está activado y además hay luz general.*/
    
    public static boolean interruptor = true;
    private boolean luz = false;
    
    public void encendida (){
        this.luz = true;
    }
    
    public void apagada (){
        this.luz = false;
    }
    
    public boolean estado (){
        return this.luz && interruptor;
    }
    
    public String mostrarEstado(){
        String res;
        if (estado()){
            res = "Encendida";
        }else {
            res = "Apagada";
        }
        
        return res;
    }
    
}
