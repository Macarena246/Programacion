/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.aeropuerto.test;

import tema7.aeropuerto.personal.Pasajero;
import tema7.aeropuerto.personal.Piloto;
import tema7.aeropuerto.personal.Piloto.Rango;
import tema7.aeropuerto.vuelos.Vuelos;

/**
 *
 * @author Macarena
 */
public class TestAeropuerto {
    
    
    /*Habrá que realizar un test creando un vuelo de Kiev a Sevilla con un pasajero que tenga vuestros datos personales.*/
    
    public static void main(String[] args) {
        
    Piloto piloto1 = new Piloto("Juan Antonio", "Sánchez Ramírez", "19071907B", "chicoplayboy@gmail.com", 3000, Rango.ALPHA, true);
    Pasajero pasajero1 = new Pasajero("Macarena", "Jurado Rodríguez", "10020030S", "tugatitasalvaje@gmail.com", "100200");
    Pasajero pasajero2 = new Pasajero("Sara", "Jurado Rodríguez", "10120233L", "laninadetusojos@gmail.com", "101202");
    Pasajero[] pasajeros = {pasajero1, pasajero2};
    Vuelos vuelo1 = new Vuelos("Kiev", "Sevilla", piloto1, pasajeros, 180);
    
    vuelo1.mostrarPasajero();
        
    }
    
}
