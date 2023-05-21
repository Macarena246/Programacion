/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase principal que representa la tabla Historial_Jugador.
 *
 * @author Macarena
 */
public class HistorialJugador {

    /**
     * Atributos.
     */
    private int idHistorico; //Autoincrement.
    private HistorialClub historialClub; //Representa el atributo idMilitancia de la clase Historial_Club. Es autoincrement.
    private Jugador jugador; //Representa el atributo NIF en la clase Jugador.

    //Constructor por defecto de Historial_Jugador.
    public HistorialJugador() {

    }

    //Constructor con parámetros.
    public HistorialJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    //Getters y Setters.
    public int getIdHistorico() {
        return idHistorico;
    }

    public void setIdHistorico(int idHistorico) {
        this.idHistorico = idHistorico;
    }

    public HistorialClub getHistorialClub() {
        return historialClub;
    }

    public void setHistorialClub(HistorialClub historialClub) {
        this.historialClub = historialClub;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
}
