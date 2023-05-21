/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que representa la tabla Club.
 *
 * @author Macarena
 */
public class Club {

    /**
     * Atributos.
     */
    private int idClub; //Autoincrement.
    private String nombreClub;
    private int annoCreacion;
    private String estadio;
    private List<Jugador> futbolistas;

    //Constructor por defecto de Club.
    public Club() {
        futbolistas = new ArrayList<>();
    }

    //Constructor con parámetros.
    public Club(String nombreClub, int annoCreacion, String estadio) {
        this.nombreClub = nombreClub;
        this.annoCreacion = annoCreacion;
        this.estadio = estadio;
    }

    //Getters y Setters.
    public int getIdClub() {
        return idClub;
    }

    public void setIdClub(int idClub) {
        this.idClub = idClub;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public int getAnnoCreacion() {
        return annoCreacion;
    }

    public void setAnnoCreacion(int annoCreacion) {
        this.annoCreacion = annoCreacion;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return "Club{" + "Nombre del club: " + nombreClub + ", Año de creación: " + annoCreacion + ", Estadio: " + estadio + '}';
    }

    /**
     * Método que devuelve los jugadores.
     *
     * @return
     */
    public List<Jugador> getFutbolistas() {
        return futbolistas;
    }

    /**
     * Método para listar los jugadores.
     */
    public void listarFutbolistas() {
        if (futbolistas.isEmpty()) {
            System.out.println("No hay jugadores asociados al club.");
        } else {
            System.out.println("Jugadores asociados al club: ");
            for (Jugador jugador : futbolistas) {
                System.out.println(jugador);
            }
        }
    }

}
