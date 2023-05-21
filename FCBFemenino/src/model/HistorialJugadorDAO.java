/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connection.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal DAO de Historial_Jugador.
 *
 * @author Macarena
 */
public class HistorialJugadorDAO {

    //Atributo para la conexión.
    private ConexionBD conexion;

    //Constructor por defecto.
    public HistorialJugadorDAO() {

    }

    //Constructor con parámetros.
    public HistorialJugadorDAO(ConexionBD conexion) {
        this.conexion = conexion;
    }

    /**
     * Método para agregar datos a Historial_Jugador.
     *
     * @param historialJugador
     * @throws SQLException
     */
    public void createHistorialJugador(HistorialJugador historialJugador) throws SQLException {
        String create = "INSERT INTO HISTORIAL_JUGADOR (C_NIF) VALUES (?)";

        conexion.openConnect();
        try {
            PreparedStatement statement = conexion.getCx().prepareStatement(create);
            statement.setString(1, historialJugador.getJugador().getNif());

            statement.executeUpdate();
            System.out.println("Datos agregados correctamente al historial del jugador de la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al insertar datos en el historial del jugador de la base de datos: " + e.getMessage());
            throw e;
        } finally {
            conexion.closeConnect();
        }
    }

    /**
     * Método para mostrar los datos de Historial_Jugador.
     *
     * @param jugador
     * @return
     * @throws SQLException
     */
    public List<HistorialJugador> readHistorialJugador(Jugador jugador) throws SQLException {
        List<HistorialJugador> historialJugadores = new ArrayList<>();
        String read = "SELECT * FROM HISTORIAL_JUGADOR WHERE C_NIF = ?";

        conexion.openConnect();
        try {
            PreparedStatement statement = conexion.getCx().prepareStatement(read);
            statement.setString(1, jugador.getNif());
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                historialJugadores.add(new HistorialJugador(jugador));
            }

        } catch (SQLException e) {
            System.err.println("Error al mostrar el historial de jugadores de la base de datos: " + e.getMessage());
            throw e;
        } finally {
            conexion.closeConnect();
        }

        return historialJugadores;
    }

    /**
     * Método para modificar los datos de Historial_Jugador.
     *
     * @param historialJugador
     * @throws SQLException
     */
    public void updateHistorialJugador(HistorialJugador historialJugador) throws SQLException {
        String update = "UPDATE HISTORIAL_JUGADOR SET ID_Militancia = ? WHERE C_ID_Historico = ?";
        conexion.openConnect();
        try {
            PreparedStatement statement = conexion.getCx().prepareStatement(update);
            statement.setInt(1, historialJugador.getHistorialClub().getIdMilitancia());

            statement.executeUpdate();
            System.out.println("El historial del jugador ha sido modificado correctamente en la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al modificar el historial del jugador en la base de datos: " + e.getMessage());
            throw e;
        } finally {
            conexion.closeConnect();
        }
    }

    /**
     * Método para eliminar los datos de Historial_Jugador.
     *
     * @param historialJugador
     * @throws SQLException
     */
    public void deleteHistorialJugador(HistorialJugador historialJugador) throws SQLException {
        String delete = "DELETE FROM HISTORIAL_JUGADOR WHERE C_NIF = ?";

        conexion.openConnect();
        try {
            PreparedStatement statement = conexion.getCx().prepareStatement(delete);
            statement.setString(1, historialJugador.getJugador().getNif());

            statement.executeUpdate();
            System.out.println("El historial del jugador ha sido eliminado correctamente de la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar el historial del jugador de la base de datos: " + e.getMessage());
            throw e;
        } finally {
            conexion.closeConnect();
        }
    }
}
