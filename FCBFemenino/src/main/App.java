/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import model.Club;
import model.ClubDAO;
import model.Jugador;
import model.JugadorDAO;

/**
 * Clase principal de la aplicación.
 *
 * @author Macarena
 */
public class App {

    //Scanner y objetos Jugador y Club.
    private static final Scanner escaner = new Scanner(System.in);
    private static final JugadorDAO jugadorDAO = new JugadorDAO();
    private static final ClubDAO clubDAO = new ClubDAO();

    /**
     * Método principal de la clase App.
     *
     * @param args
     * @throws java.sql.SQLException
     */
    
    
    public static void main(String[] args) throws SQLException {
        int opcion;
        do {
            mostrarMenu();
            opcion = escaner.nextInt();
            escaner.nextLine();

            switch (opcion) {
                case 1:
                    insertarDatosJugador();
                    break;
                case 2:
                    insertarDatosClub();
                    break;
                case 3:
                    modificarDatos();
                    break;
                case 4:
                    asociarFutbolistaClub();
                    break;
                case 5:
                    listarFutbolistasClub();
                    break;
                case 6:
                    listarClubesFutbolista();
                    break;
                case 7:
                    listarClubes();
                    break;
                case 8:
                    listarJugadores();
                    break;
                case 0:
                    System.out.println("¡Hasta otra!");
                    break;
                default:
                    System.out.println("La opción es inválida. Introduce un número válido.");
                    break;
            }
        } while (opcion != 0);
    }

    /**
     * Método para mostrar el menú.
     */
    private static void mostrarMenu() {
        System.out.println("---- MENÚ ----");
        System.out.println("A continuación, se mostrarán las distintas acciones que puede realizar.");
        System.out.println("1. Introducir datos de futbolistas.");
        System.out.println("2. Introducir datos de clubes de fútbol.");
        System.out.println("3. Modificar datos de futbolistas y clubes.");
        System.out.println("4. Asociar futbolistas a clubes.");
        System.out.println("5. Obtener la lista de los futbolistas asociados a un club.");
        System.out.println("6. Obtener la lista de los clubes en los que ha militado un futbolista.");
        System.out.println("7. Listar todos los clubes.");
        System.out.println("8. Listar todos los jugadores.");
        System.out.println("0. Salir de la aplicación.");
        System.out.println("Indique aquí la opción que desea elegir: ");
    }

    /**
     * Método para introducir datos de un jugador.
     */
    private static void insertarDatosJugador() {
        System.out.println("Ha seleccionado la opción 1. Introduzca a continuación los datos del futbolista: ");
        System.out.print("NIF: ");
        String nif = escaner.nextLine();
        System.out.println("Nombre: ");
        String nombre = escaner.nextLine();
        System.out.print("Primer apellido: ");
        String apellido1 = escaner.nextLine();
        System.out.print("Segundo apellido: ");
        String apellido2 = escaner.nextLine();
        System.out.print("Nacionalidad: ");
        String nacionalidad = escaner.nextLine();
        System.out.print("Fecha de nacimiento: ");
        String fechaNacimiento = escaner.nextLine();
        Date nacimiento = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date utilDate = sdf.parse(fechaNacimiento);
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(utilDate);
            int year = calendario.get(Calendar.YEAR);
            int month = calendario.get(Calendar.MONTH);
            int day = calendario.get(Calendar.DAY_OF_MONTH);
            nacimiento = new Date(year, month, day);
        } catch (ParseException e) {
            System.out.println("El formato de la fecha es incorrecto. Inténtelo de nuevo: " + e.getMessage());
            return; //Asegura el ingreso de una fecha válida.
        }

        Jugador jugador = new Jugador(nif, nombre, apellido1, apellido2, nacionalidad, nacimiento);
        jugadorDAO.createJugador(jugador);
        System.out.println("El jugador ha sido agregado correctamente.");
    }

    /**
     * Método para insertar datos de un club.
     *
     * @throws SQLException
     */
    private static void insertarDatosClub() throws SQLException {
        System.out.println("Ha seleccionado la opción 2. Introduzca a continuación los datos del club: ");
        System.out.println("Nombre del club: ");
        String nombre = escaner.nextLine();
        System.out.println("Año de creación: ");
        int annoCreacion = escaner.nextInt();
        escaner.nextLine(); //Limpia el búfer de entrada.
        System.out.println("Estadio: ");
        String estadio = escaner.nextLine();

        Club club = new Club(nombre, annoCreacion, estadio);
        clubDAO.createClub(club);
        System.out.println("El club ha sido añadido correctamente.");
    }

    /**
     * Método para modificar datos.
     *
     * @throws SQLException
     */
    private static void modificarDatos() throws SQLException {
        System.out.println("Ha seleccionado la opción 3.");
        System.out.println("¿Qué desea modificar?");
        System.out.println("1. Modificar un jugador.");
        System.out.println("2. Modificar un club.");
        System.out.println("Indique aquí la opción que desea: ");
        int opcion = escaner.nextInt();
        escaner.nextLine();

        switch (opcion) {
            case 1:
                modificarDatosJugador();
                break;
            case 2:
                modificarDatosClub();
                break;
            default:
                System.out.println("Opción inválida. Introduzca un número válido.");
                break;
        }
    }

    /**
     * Método para modificar los datos de un jugador.
     *
     * @throws SQLException
     */
    private static void modificarDatosJugador() throws SQLException {
        System.out.println("Ha elegido la opción 1. Inserte el NIF del jugador que desea modificar: ");
        String nif = escaner.nextLine();
        Jugador jugador = jugadorDAO.buscarNif(nif);

        if (jugador != null) {
            System.out.println("Modifique los datos del jugador.");
            System.out.println("Nombre: ");
            String nuevoNombre = escaner.nextLine();
            System.out.println("Primer apellido: ");
            String nuevoApellido1 = escaner.nextLine();
            System.out.println("Segundo apellido: ");
            String nuevoApellido2 = escaner.nextLine();
            System.out.println("Nacionalidad: ");
            String nuevaNacionalidad = escaner.nextLine();
            System.out.println("Fecha de Nacimiento (AAAA-MM-DD): ");
            String nuevaNacimiento = escaner.nextLine();
            Date nuevaFecha = null;
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date utilDate = sdf.parse(nuevaNacimiento);
                Calendar calendario = Calendar.getInstance();
                calendario.setTime(utilDate);
                int year = calendario.get(Calendar.YEAR);
                int month = calendario.get(Calendar.MONTH);
                int day = calendario.get(Calendar.DAY_OF_MONTH);
                nuevaFecha = new Date(year, month, day);
            } catch (ParseException e) {
                System.out.println("El formato de la fecha es incorrecto. Inténtelo de nuevo: " + e.getMessage());
                return; //Asegura el ingreso de una fecha válida.
            }

            jugador.setNombreJugador(nuevoNombre);
            jugador.setApellido1(nuevoApellido1);
            jugador.setApellido2(nuevoApellido2);
            jugador.setNacionalidad(nuevaNacionalidad);
            jugador.setNacionalidad(nuevaNacimiento);

            jugadorDAO.updateJugador(jugador);
            System.out.println("Los datos del jugador se han actualizado correctamente.");
        } else {
            System.out.println("No se encontró ningún jugador con este NIF.");
        }
    }

    /**
     * Método para modificar los datos de un club.
     *
     * @throws SQLException
     */
    private static void modificarDatosClub() throws SQLException {
        System.out.println("Ha elegido la opción 2. Introduzca el nombre del club que desea modificar.");
        String nombreClub = escaner.nextLine();
        Club club = clubDAO.buscarNombre(nombreClub);

        if (club != null) {
            System.out.println("Inserte los datos que quiere modificar del club.");
            System.out.println("Año de creación: ");
            int annoCreacion = escaner.nextInt();
            escaner.nextLine();
            System.out.println("Estadio: ");
            String estadio = escaner.nextLine();

            club.setAnnoCreacion(annoCreacion);
            club.setEstadio(estadio);

            clubDAO.updateClub(club);
            System.out.println("Los datos han sido actualizados correctamente.");
        } else {
            System.out.println("No se encontró ningún club con este nombre.");
        }
    }

    /**
     * Método para asociar jugadores a un club.
     *
     * @throws SQLException
     */
    private static void asociarFutbolistaClub() throws SQLException {
        System.out.println("Ha seleccionado la opción 4. Introduzca el NIF del jugador que quiere asociar.");
        String nif = escaner.nextLine();
        System.out.println("Ahora indique el nombre del club al que quiere asociarlo.");
        String nombreClub = escaner.nextLine();

        try {
            Jugador jugador = jugadorDAO.buscarNif(nif);
            Club club = clubDAO.buscarNombre(nombreClub);

            if (jugador != null && club != null) {
                jugadorDAO.asociarJugadorClub(jugador, club);
                System.out.println("El jugador ha sido asociado correctamente al club en la base de datos.");
            } else {
                System.out.println("No se encontró el jugador o el club en la base de datos.");
            }
        } catch (SQLException e) {
            System.err.println("Error al asociar el futbolista al club: " + e.getMessage());
            throw e;
        }
    }

    /**
     * Método para listar los jugadores de un club.
     *
     * @throws SQLException
     */
    private static void listarFutbolistasClub() throws SQLException {
        System.out.println("Ha seleccionado la opción 5. Introduzca el nombre del club: ");
        String nombreClub = escaner.nextLine();

        try {
            Club club = clubDAO.buscarNombre(nombreClub);

            if (club != null) {
                System.out.println("Jugadores asociados al club " + nombreClub + ": ");

                for (Jugador jugador : club.getFutbolistas()) {
                    System.out.println(jugador);
                }
            } else {
                System.out.println("No se encontró el club en la base de datos.");
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la lista de jugadores del club: " + e.getMessage());
            throw e;
        }
    }

    /**
     * Método para listar los clubes en los que ha militado un jugador.
     *
     * @throws SQLException
     */
    private static void listarClubesFutbolista() throws SQLException {
        System.out.println("Ha seleccionado la opción 6. Introduzca el NIF del jugador: ");
        String nif = escaner.nextLine();

        Jugador jugador = jugadorDAO.buscarNif(nif);
        if (jugador != null) {
            System.out.println("Clubes en los que ha militado el futbolista con NIF " + nif + ": ");

            for (Club club : jugador.getClubes()) {
                System.out.println(club);
            }
        } else {
            System.out.println("No se encontró el jugador en la base de datos.");
        }
    }

    /**
     * Método para listar todos los clubes.
     *
     * @throws SQLException
     */
    private static void listarClubes() throws SQLException {
        System.out.println("Has seleccionado la opción 7.");

        List<Club> clubs = clubDAO.readClub();
        System.out.println("A continuación tiene el listado de clubes: ");
        clubs.forEach(System.out::println);
    }

    /**
     * Método para listar todos los jugadores.
     *
     * @throws SQLException
     */
    private static void listarJugadores() throws SQLException {
        System.out.println("Ha seleccionado la opción 8.");

        System.out.println("A continuación aparecerá la lista de los jugadores:  ");
        for (Jugador jugador : jugadorDAO.readJugador()) {
            System.out.println(jugador);
        }
    }

}
