/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hora;

/**
 *
 * @author Macarena
 */
public class Hora {
    
    /*Diseñar la clase Hora, que representa un instante de tiempo compuesto por la hora (de 0 a 23) y los minutos. Dispone de los métodos:
    
        -Hora (hora, minuto), que construye un objeto con los datos pasados como parámetros.
        -void inc(), que incrementa la hora en un minuto.
        -boolean setMinutos(valor), que asigna un valor, si es válido, a los minutos. Devuelve true o false según haya sido posible modificar
        los minutos o no.
        -boolean setHora(valor), que asigna un valor, si está comprendido entre 0 y 23, a la hora. Devuelve true o false según haya sido posible
        cambiar la hora o no.
        -String toString(), que devuelve un String con la representación de la hora.
    */
    
    private int hora;
    private int minutos;
    
    Hora (int hora, int minutos){
        setHora(hora);
        setMinutos(minutos);
    }
    
    
    public void inc(){
        if(minutos < 59){
            minutos++;
        }else{
            minutos = 0;
            if(hora < 23){
                hora++;
            }else{
                hora = 0;
            }
        }
    }
    
    
    public boolean setMinutos(int min){
        if(min >= 0 && min <= 59){
            minutos = min;
            return true;
        }else{
            return false;
        }
    }
    
    
    
    public boolean setHora(int h){
        boolean res;
        if(h >= 0 && h <= 23){
            hora = h;
            res = true;
        }else{
            res = false;
            System.out.println(res);
        }
        return res;
    }
    
    
    @Override
    public String toString(){
        return String.format("%02d:%02d", hora, minutos);
    }
}
