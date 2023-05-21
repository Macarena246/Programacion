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
 * Clase principal DAO de Historial_Club.
 *
 * @author Macarena
 */
public class HistorialClubDAO {

    /**
     * Atributo para la conexión.
     */
    private ConexionBD conexion;

    //Constructor DAO por defecto.
    public HistorialClubDAO() {

    }

    //Constructor DAO con parámetros.
    public HistorialClubDAO(ConexionBD conexion) {
        this.conexion = conexion;
    }

    /**
     * Método para agregar datos a Historial_Club.
     *
     * @param historialClub
     * @throws java.sql.SQLException
     */
    public void createHistorialClub(HistorialClub historialClub) throws SQLException {
        String create = "INSERT INTO HISTORIAL_CLUB (C_ID_Club, C_Division, C_Temporada) VALUES (?, ?, ?, ?)";

        conexion.openConnect();
        try {
            PreparedStatement statement = conexion.getCx().prepareStatement(create);
            statement.setInt(1, historialClub.getIdMilitancia());
            statement.setInt(2, historialClub.getClub().getIdClub());
            statement.setInt(3, historialClub.getDivision());
            statement.setString(4, historialClub.getTemporada());

            statement.executeUpdate();
            System.out.println("Datos agregados correctamente al historial del club de la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al agregar el historial del club a la base de datos: " + e.getMessage());
            throw e;
        } finally {
            conexion.closeConnect();
        }
    }

    /**
     * Método para obtener los datos de Historial_Club.
     *
     * @return
     * @throws SQLException
     */
    public List<HistorialClub> readHistorialClub() throws SQLException {
        List<HistorialClub> historialClubes = new ArrayList<>();
        String read = "SELECT * FROM HISTORIAL_CLUB";

        conexion.openConnect();
        try {
            PreparedStatement statement = conexion.getCx().prepareStatement(read);
            ResultSet resultado = statement.executeQuery();
            while (resultado.next()) {
                int division = resultado.getInt("C_Division");
                String temporada = resultado.getString("C_Temporada");

                HistorialClub historialClub = new HistorialClub(division, temporada);
                historialClubes.add(historialClub);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener el historial de clubes de la base de datos: " + e.getMessage());
            throw e;
        } finally {
            conexion.closeConnect();
        }
        return historialClubes;
    }

    /**
     * Método para modificar los datos de Historial_Club.
     *
     * @param historialClub
     * @throws SQLException
     */
    public void updateHistorialClub(HistorialClub historialClub) throws SQLException {
        String update = "UPDATE HISTORIAL_CLUB SET C_Division = ?, C_Temporada = ? WHERE C_ID_Militancia = ?";

        conexion.openConnect();
        try {
            PreparedStatement statement = conexion.getCx().prepareStatement(update);
            statement.setInt(1, historialClub.getDivision());
            statement.setInt(2, historialClub.getIdMilitancia());
            statement.executeUpdate();
            System.out.println("Se ha modificado correctamente el historial del club de la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al modificar el historial del club en la base de datos: " + e.getMessage());
            throw e;
        } finally {
            conexion.closeConnect();
        }
    }

    /**
     * Método para eliminar los datos de Historial_Club.
     *
     * @param idMilitancia
     * @throws SQLException
     */
    public void deleteHistorialClub(int idMilitancia) throws SQLException {
        String delete = "DELETE FROM HISTORIAL_CLUB WHERE C_ID_Militancia = ?";

        conexion.openConnect();
        try {
            PreparedStatement statement = conexion.getCx().prepareStatement(delete);
            statement.setInt(1, idMilitancia);
            statement.executeUpdate();
            System.out.println("El historial del club ha sido eliminado correctamente de la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar el historial del club de la base de datos: " + e.getMessage());
            throw e;
        } finally {
            conexion.closeConnect();
        }
    }

}
