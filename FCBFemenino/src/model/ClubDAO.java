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
 * Clase principal DAO de Club.
 *
 * @author Macarena
 */
public class ClubDAO {

    /**
     * Atributo para la conexión.
     */
    private ConexionBD conexion;

    //Constructor DAO por defecto.
    public ClubDAO() {

    }

    //Constructor DAO con parámetros.
    public ClubDAO(ConexionBD conexion) {
        this.conexion = conexion;
    }

    /**
     * Método para insertar un nuevo club.
     *
     * @param club
     * @throws java.sql.SQLException
     */
    public void createClub(Club club) throws SQLException {
        String create = "INSERT INTO CLUB (C_Nombre_Club, C_Anno_Creacion, C_Estadio) VALUES (?, ?, ?)";

        conexion.openConnect(); //Abre conexión.
        try {
            conexion.openConnect();
            PreparedStatement statement = conexion.getCx().prepareStatement(create);
            statement.setString(1, club.getNombreClub());
            statement.setInt(2, club.getAnnoCreacion());
            statement.setString(3, club.getEstadio());

            statement.executeUpdate();
            System.out.println("El club se ha agregado correctamente a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al agregar el club a la base de datos: " + e.getMessage());
        } finally {
            conexion.closeConnect(); //Cierra conexión.
        }
    }

    /**
     * Método para mostrar todos los clubes.
     *
     * @return
     */
    public List<Club> readClub() {
        conexion.openConnect();
        ArrayList<Club> clubes = new ArrayList<>();

        String read = "SELECT * FROM CLUB";

        try {
            PreparedStatement statement = conexion.getCx().prepareStatement(read);
            ResultSet resultado = statement.executeQuery();
            while (resultado.next()) {
                String nombreClub = resultado.getString("C_Nombre_Club");
                int annoCreacion = resultado.getInt("C_Anno_Creacion");
                String estadio = resultado.getString("C_Estadio");

                Club club = new Club(nombreClub, annoCreacion, estadio);
                clubes.add(club);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener los clubes de la base de datos: " + e.getMessage());
        } finally {
            conexion.closeConnect();
        }

        return clubes;
    }

    /**
     * Método para modificar un club.
     *
     * @param club
     * @throws java.sql.SQLException
     */
    public void updateClub(Club club) throws SQLException {

        String update = "UPDATE CLUB SET C_Nombre_Club = ?, C_Anno_Creacion = ?, C_Estadio = ? WHERE C_ID_Club = ?";

        conexion.openConnect();
        try {
            PreparedStatement statement = conexion.getCx().prepareStatement(update);
            statement.setString(1, club.getNombreClub());
            statement.setInt(2, club.getAnnoCreacion());
            statement.setString(3, club.getEstadio());

            statement.executeUpdate();
            System.out.println("Club modificado con éxito.");
        } catch (SQLException e) {
            System.err.println("Error al modificar el club en la base de datos: " + e.getMessage());
        } finally {
            conexion.closeConnect();
        }
    }

    /**
     * Método para eliminar un club.
     *
     * @param idClub
     * @throws java.sql.SQLException
     */
    public void deleteClub(int idClub) throws SQLException {

        String delete = "DELETE FROM CLUB WHERE C_ID_Club = ?";

        conexion.openConnect();
        try {
            PreparedStatement statement = conexion.getCx().prepareStatement(delete);
            statement.setInt(1, idClub);

            statement.executeUpdate();
            System.out.println("Club eliminado correctamente de la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar el club de la base de datos: " + e.getMessage());
        } finally {
            conexion.closeConnect();
        }
    }

    /**
     * Método para buscar un club por su nombre.
     *
     * @param nombreClub
     * @return
     * @throws SQLException
     */
    public Club buscarNombre(String nombreClub) throws SQLException {
        try {

            conexion.openConnect();

            List<Club> clubes = readClub();

            for (Club club : clubes) {
                if (club.getNombreClub().equals(nombreClub)) {
                    return club;
                }
            }

            return null; //No se ha encontrado el club.

        } finally {
            conexion.closeConnect();
        }
    }

}
