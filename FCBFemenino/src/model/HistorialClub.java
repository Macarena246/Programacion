/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase principal que representa la tabla Historial_Club.
 *
 * @author Macarena
 */
public class HistorialClub {

    /**
     * Atributos.
     */
    private int idMilitancia; //Autoincrement
    private Club club; //Representa el atributo idClub en la clase Club. Es autoincrement.
    private int division;
    private String temporada;

    //Constructor por defecto de Historial_Club.
    public HistorialClub() {

    }

    //Constructor con parámetros.
    public HistorialClub(int division, String temporada) {
        this.division = division;
        this.temporada = temporada;
    }

    //Getters y Setters.
    public int getIdMilitancia() {
        return idMilitancia;
    }

    public void setIdMilitancia(int idMilitancia) {
        this.idMilitancia = idMilitancia;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "HistorialClub{" + "Club=" + club + ", division=" + division + ", temporada=" + temporada + '}';
    }
    
}
