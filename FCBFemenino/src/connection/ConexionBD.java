/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase principal. Conexión a la BD.
 *
 * @author Macarena
 */
public class ConexionBD {

    /**
     * Atributos de la clase ConexionBD.
     */
    String url = "jdbc:mysql://localhost:3306/historicofutbol";
    String user = "root";
    String password = "";
    private Connection cx;

    //Constructor por defecto de ConexionBD.
    public ConexionBD() {

    }

    /**
     * Método para abrir la conexión con la BD.
     */
    public void openConnect() {

        try {
            cx = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Método para cerrar la conexión con la BD.
     */
    public void closeConnect() {
        try {
            cx.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión.");
            e.printStackTrace();
        }
    }

    /**
     * Método para ejecutar consultas SQL de lectura. (SELECT)
     *
     * @param query
     * @return
     */
    public ResultSet executeQuery(String sql) {
        try {
            Statement statement = cx.createStatement();
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Método para ejecutar las sentencias CUD. (Insertar, modificar y borrar)
     *
     * @param sql
     * @return
     */
    public boolean executeUpdate(String sql) {
        try {
            Statement statement = cx.createStatement();
            return statement.executeUpdate(sql) <= 0 ? false : true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Método get para la conexión en otros métodos.
     *
     * @return
     */
    public Connection getCx() {
        return cx;
    }

}
