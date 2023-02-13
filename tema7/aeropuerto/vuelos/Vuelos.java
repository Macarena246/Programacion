/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.aeropuerto.vuelos;

import tema7.aeropuerto.personal.Pasajero;
import tema7.aeropuerto.personal.Piloto;

/**
 *
 * @author Macarena
 */
public class Vuelos {
    
    /*El aeropuerto también pretende gestionar los vuelos. Los vuelos se caracterizan por una ciudad de origen,
    otra de destino, un/a piloto, una lista de pasajeros que viajan en él y una duración.*/
    
    String origen;
    String destino;
    Piloto piloto;
    Pasajero [] pasajero;
    int duracion;
    
    public Vuelos (String origen, String destino, Piloto piloto, Pasajero [] pasajero, int duracion){
        this.origen = origen;
        this.destino = destino;
        this.piloto = piloto;
        this.pasajero = pasajero;
        this.duracion = duracion;
    }
    
    
    //Método para mostrar los pasajeros:
    
    public void mostrarPasajero(){
              
        for(int i = 0; i < pasajero.length; i++){
            this.pasajero[i].mostrarPasajero();
        }
    }
    
}
