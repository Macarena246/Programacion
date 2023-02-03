/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.patinetes;

import java.util.Date;

/**
 *
 * @author Macarena
 */
public class FichaTecnicaPatinete {
    
    /*Se desea guardar también la fecha en la que se repara cada patinete y el número
    de horas que se ha tardado en arreglarlo.*/
    
    
    Date reparacion;
    int horas;
    Patinete patinete;
    Cliente cliente;
    Tecnico tecnico;
    
    public FichaTecnicaPatinete (Patinete patinete, Cliente cliente, Tecnico tecnico, Date reparacion, int horas){
        
        this.patinete = patinete;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.reparacion = reparacion;
        this.horas = horas;
    }
}
