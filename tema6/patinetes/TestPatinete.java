/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.patinetes;

import java.util.Date;
import tema6.patinetes.Patinete.ColorPatinete;

/**
 *
 * @author Macarena
 */
public class TestPatinete {
    
    public static void main(String[] args) {
        
        Patinete patinete = new Patinete ("1234", "xPlus", "Xiaomi", 250, ColorPatinete.GRIS);
        Cliente cliente = new Cliente ("12345678A", "Macarena", "Jurado Rodríguez", "Calle María Mazzarello", "956323244", patinete);
        Tecnico tecnico = new Tecnico ("12123434B", "Susana", "Horia Cruda", new Date (2015, 02, 20), 1200);
        FichaTecnicaPatinete ficha = new FichaTecnicaPatinete (patinete, cliente, tecnico, new Date (2022, 12, 29), 1);
        
        System.out.println("La técnico " + tecnico.nombre + " ha reparado el patinete " + patinete.id + " de la marca " + patinete.marca + " del cliente " + cliente.nombre + " con DNI " + cliente.dni);
    }
    
}
