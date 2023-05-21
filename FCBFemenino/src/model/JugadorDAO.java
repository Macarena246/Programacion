/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connection.ConexionBD;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal DAO de Jugador.
 *
 * @author Macarena
 */
public class JugadorDAO {

    /**
     * Atributo de conexión.
     */
    private ConexionBD conexion;

    /**
     * Atributo para listar jugadores.
     */
    private List<Jugador> futbolistas;

    //Constructor DAO por defecto.
    public JugadorDAO() {
        conexion = new ConexionBD();
        futbolistas = new ArrayList<>();
    }

    //Constructor DAO con parámetros.
    public JugadorDAO(ConexionBD conexion) {
        this.conexion = conexion;
    }

    /**
     * Método para insertar un nuevo jugador.
     *
     * @param jugador
     */
    public void createJugador(Jugador jugador) {
        String create = "INSERT INTO JUGADOR (C_NIF, C_Nombre_Jugador, C_Apellido1, C_Apellido_2, C_Nacionalidad, C_Nacimiento) VALUES (?, ?, ?, ?, ?, ?)";

        conexion.openConnect(); //Se abre la conexión antes de que se ejecute la consulta.
        try {
            PreparedStatement statement = conexion.getCx().prepareStatement(create);
            statement.setString(1, jugador.getNif());
            statement.setString(2, jugador.getNombreJugador());
            statement.setString(3, jugador.getApellido1());
            statement.setString(4, jugador.getApellido2());
            statement.setString(5, jugador.getNacionalidad());
            statement.setDate(6, jugador.getNacimiento());

            statement.executeUpdate();
            System.out.println("Jugador agregado correctamente a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al insertar un nuevo jugador en la base de datos: " + e.getMessage());
        } finally {
            conexion.closeConnect(); //Se cierra la conexión después del bloque.
        }
    }

    /**
     * Método para leer todos los jugadores.
     *
     * @return
     */
    public List<Jugador> readJugador() {
        List<Jugador> jugadores = new ArrayList<>();

        String read = "SELECT * FROM JUGADOR";

        conexion.openConnect(); //Se abre la conexión.

        try ( PreparedStatement statement = conexion.getCx().prepareStatement(read);  ResultSet resultado = statement.executeQuery()) {

            while (resultado.next()) {
                String nif = resultado.getString("C_NIF");
                String nombreJugador = resultado.getString("C_Nombre_Jugador");
                String apellido1 = resultado.getString("C_Apellido1");
                String apellido2 = resultado.getString("C_Apellido2");
                String nacionalidad = resultado.getString("C_Nacionalidad");
                Date nacimiento = resultado.getDate("C_Nacimiento");

                Jugador jugador = new Jugador(nif, nombreJugador, apellido1, apellido2, nacionalidad, nacimiento);
                jugadores.add(jugador);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener los jugadores de la base de datos: " + e.getMessage());
        } finally {
            conexion.closeConnect(); //Se cierra la conexión.
        }
        return jugadores;

    }

    /**
     * Método para modificar un jugador.
     *
     * @param jugador
     * @throws java.sql.SQLException
     */
    public void updateJugador(Jugador jugador) throws SQLException {
        String update = "UPDATE JUGADOR SET C_Nombre_Jugador = ?, C_Apellido1 = ?, C_Apellido2 = ?, C_Nacionalidad = ?, C_Nacimiento = ? WHERE C_NIF = ?";

        conexion.openConnect(); //Se abre la conexión.

        try {
            PreparedStatement statement = conexion.getCx().prepareStatement(update);
            statement.setString(1, jugador.getNombreJugador());
            statement.setString(2, jugador.getApellido1());
            statement.setString(3, jugador.getApellido2());
            statement.setString(4, jugador.getNacionalidad());
            statement.setDate(5, jugador.getNacimiento());
            statement.setString(6, jugador.getNif());

            statement.executeUpdate();
            System.out.println("Jugador modificado correctamente en la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al modificar el jugador de la base de datos: " + e.getMessage());
        } finally {
            conexion.closeConnect(); //Se cierra la conexión.
        }
    }

    /**
     * Método para eliminar un jugador.
     *
     * @param nif
     * @throws java.sql.SQLException
     */
    public void deleteJugador(String nif) throws SQLException {
        String delete = "DELETE FROM JUGADOR WHERE C_NIF = ?";
        conexion.openConnect(); //Abre conexión.
        try {
            PreparedStatement statement = conexion.getCx().prepareStatement(delete);
            statement.setString(1, nif);

            statement.executeUpdate();
            System.out.println("Jugador eliminado correctamente de la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar el jugador de la base de datos: " + e.getMessage());
        } finally {
            conexion.closeConnect(); //Cierra conexión.
        }
    }

    /**
     * Método para buscar a un jugador por su NIF.
     *
     * @param nif
     * @return
     */
    public Jugador buscarNif(String nif) {
        List<Jugador> jugadores = readJugador();
        for (Jugador jugador : jugadores) {
            if (jugador.getNif().equals(nif)) {
                return jugador;
            }
        }

        return null; //No se ha encontrado el jugador.
    }

    /**
     * Método para asociar un jugador a un club.
     *
     * @param jugador
     * @param club
     * @throws SQLException
     */
    public void asociarJugadorClub(Jugador jugador, Club club) throws SQLException {
        String asociate = "INSERT INTO HISTORIAL_JUGADOR (C_ID_Militancia, C_NIF) VALUES (?, ?)";

        try ( PreparedStatement statement = conexion.getCx().prepareStatement(asociate)) {

            //Obtener ID_Militancia del club.
            int idMilitancia = obtenerIdMilitanciaClub(club);

            //Asociar jugador al club en la tabla Historial_Jugador.
            statement.setInt(1, idMilitancia);
            statement.setString(2, jugador.getNif());

            statement.executeUpdate();
            System.out.println("El jugador ha sido asociado al club correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al asociar el jugador al club: " + e.getMessage());
            throw e;
        }
    }

    /**
     * Método para obtener el ID_Militancia del club.
     *
     * @param club
     * @return
     * @throws SQLException
     */
    private int obtenerIdMilitanciaClub(Club club) throws SQLException {
        String obtain = "SELECT C_ID_Militancia FROM HISTORIAL_CLUB WHERE C_ID_CLUB = ?";

        try ( PreparedStatement statement = conexion.getCx().prepareStatement(obtain)) {
            statement.setInt(1, club.getIdClub());

            try ( ResultSet resultado = statement.executeQuery()) {
                if (resultado.next()) {
                    return resultado.getInt("C_ID_Militancia");
                }
            }
        }

        return -1; //Si no se encuentra el ID_Militancia del club.
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
