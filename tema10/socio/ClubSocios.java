/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema10.socio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Macarena
 */

/*Implementar la clase Socio, cuyos atributos son dni, nombre y fechaAlta, que deberá incluir el método equals(),
la interfaz Comparable basada en el dni y el método antiguedad(). Implementar un programa que gestione los socios
de un club guardando los datos en el fichero socios.dat (inicialmente vacío). Al arrancar la aplicación, se leen
los datos del fichero y se abre un menú con las opciones: 1. Alta; 2. Baja; 3. Modificación; 4. Listado por DNI;
5. Listado por antigüedad, y 6. Salir. 
Al salir de la aplicación se guardan en el fichero los datos actualizados.

Para realizar dicho ejercicio será necesario que Socio implemente la interfaz Serializable y crear el objeto:
ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))*/

public class ClubSocios implements Serializable, Comparable<ClubSocios>{
    
    //Atributos:
    protected String dni;
    protected String nombre;
    protected LocalDate fechaAlta;
    
    //Constructor con parámetros:
    public ClubSocios(String dni, String nombre, LocalDate fechaAlta){
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }
    
    //Getters y Setters:
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    //Método equals:
    @Override
    public boolean equals(Object objeto){
        boolean res = false;
        if(objeto == this){
            res = true;
        }
        if(!(objeto instanceof ClubSocios)){
            res = false;
        }
        ClubSocios otro = (ClubSocios) objeto;
        return dni.equals(otro.dni);
    }

    //Método compareTo:
    @Override
    public int compareTo(ClubSocios otro){
        return dni.compareTo(otro.dni);
    }
    
    //Método antiguedad:
    public int antiguedad(){
        return LocalDate.now().getYear() - fechaAlta.getYear();
    }

    //Método toString:
    @Override
    public String toString(){
        return dni + " - " + nombre + " - " + fechaAlta.toString();
    }
    
    
    //Método principal:
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<ClubSocios> socios = new ArrayList<>();
        File fichero = new File ("socios.dat");
        if(fichero.exists()){
            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fichero))) {
            socios = (ArrayList<ClubSocios>) in.readObject();
                System.out.println("Se han cargado los datos de " + socios.size() + " socios.");
            } catch(IOException | ClassNotFoundException e){
                System.out.println("Error al leer el fichero: " + e.getMessage());
            }
        }
        
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        do{
            System.out.println("Menú principal:");
            System.out.println(" ");
            System.out.println("1. Alta");
            System.out.println("2. Baja");
            System.out.println("3. Modificación");
            System.out.println("4. Listado por DNI");
            System.out.println("5. Listado por antigüedad");
            System.out.println("6. Salir");
            System.out.println("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("DNI: ");
                    String dni = sc.nextLine();
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Fecha de alta (AAAA-MM-DD: ");
                    LocalDate fechaAlta = LocalDate.parse(sc.nextLine());
                    ClubSocios nuevo = new ClubSocios(dni, nombre, fechaAlta);
                    if(socios.contains(nuevo)){
                        System.out.println("Ya hay un socio con este DNI.");
                    }else{
                        socios.add(nuevo);
                        System.out.println("El socio se ha dado de alta correctamente.");
                    }
                    break;
                    
                case 2:
                    System.out.println("DNI del socio a dar de baja: ");
                    dni = sc.nextLine();
                    int indice = socios.indexOf(new ClubSocios(dni, "", null));
                    if(indice == -1){
                        System.out.println("No existe ningún socio con este DNI.");
                    } else{
                        ClubSocios socioBaja = socios.get(indice);
                        socios.remove(indice);
                        System.out.println("Socio dado de baja correctamente: ");
                        System.out.println(socioBaja.toString());
                    }
                    break;
                    
                case 3:
                    System.out.println("DNI del socio que se quiere modificar: ");
                    dni = sc.nextLine();
                    indice = socios.indexOf(new ClubSocios(dni, " ", null));
                    if(indice == -1){
                        System.out.println("No existe ningún socio con este DNI.");
                    }else{
                        ClubSocios socioModif = socios.get(indice);
                        System.out.println("Socio a modificar: ");
                        System.out.println(socioModif.toString());
                        System.out.println("Introduzca el nuevo nombre: (Pulse ENTER si desea dejarlo igual)");
                        nombre = sc.nextLine();
                        if(!nombre.equals("")){
                            socioModif.setNombre(nombre);
                        }
                        System.out.println("Nueva fecha de alta (AAAA-MM-DD): (Pulse ENTER si desea dejarlo igual)");
                        String fechaAltaNueva = sc.nextLine();
                        if(!fechaAltaNueva.equals("")){
                            fechaAlta = LocalDate.parse(fechaAltaNueva);
                            socioModif.setFechaAlta(fechaAlta);
                        }
                        System.out.println("Socio modificado correctamente.");
                        System.out.println(socioModif.toString());
                    }
                    break;
                    
                case 4:
                    Collections.sort(socios);
                    System.out.println("Listado por DNI: ");
                    System.out.println(" ");
                    for (ClubSocios socio : socios) {
                        System.out.println(socio.toString());
                    }
                    break;
                    
                case 5:
                    Collections.sort(socios, (s1, s2) -> s1.antiguedad() - s2.antiguedad());
                    System.out.println("Listado por antigüedad: ");
                    System.out.println(" ");
                    for(ClubSocios socio : socios){
                        System.out.println(socio.toString() + " - " + socio.antiguedad() + " años de antigüedad.");
                    }
                    break;
                    
                case 6:
                    salir = true;
                    break;
                    
                default:
                    System.out.println("Opción no válida.");
            }
        }while(!salir);
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichero))) {
            out.writeObject(socios);
            if(socios.size() == 1){
                System.out.println("Se han guardado los datos de " + socios.size() + " socio en el fichero.");
            } else {
                System.out.println("Se han guardado los datos de " + socios.size() + " socios en el fichero.");
            }
        }catch (IOException e){
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }
    
}
