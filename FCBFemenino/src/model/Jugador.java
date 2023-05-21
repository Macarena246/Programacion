/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que representa la tabla JUGADOR.
 *
 * @author Macarena
 */
public class Jugador {

    /**
     * Atributos de Jugador.
     */
    private String nif;
    private String nombreJugador;
    private String apellido1;
    private String apellido2;
    private String nacionalidad;
    private Date nacimiento;
    private List<Club> clubes;

    //Constructor por defecto de Jugador.
    public Jugador() {
        clubes = new ArrayList<>();
    }

    //Constructor con parámetros.
    public Jugador(String nif, String nombreJugador, String apellido1, String apellido2, String nacionalidad, Date nacimiento) {
        this.nif = nif;
        this.nombreJugador = nombreJugador;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nacionalidad = nacionalidad;
        this.nacimiento = nacimiento;
    }

    //Getters y Setters.
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Jugador{" + "NIF: " + nif + ", Nombre: " + nombreJugador + ", Primer apellido: " + apellido1 + ", Segundo apellido: " + apellido2 + ", Nacionalidad: " + nacionalidad + ", Fecha de nacimiento: " + nacimiento + '}';
    }

    /**
     * Método que devuelve los clubes.
     *
     * @return
     */
    public List<Club> getClubes() {
        return clubes;
    }

    /**
     * Método para listar los clubes.
     */
    public void listarClubes() {
        if (clubes.isEmpty()) {
            System.out.println("No hay clubes asociados al jugador.");
        } else {
            System.out.println("Clubes asociados al jugador: ");
            for (Club club : clubes) {
                System.out.println(club);
            }
        }
    }

}
