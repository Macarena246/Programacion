/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.videoclub.fecha;

import java.util.Date;

/**
 *
 * @author Macarena
 */
public class FechaEntrega {
    
    Date fecha;
    
    public FechaEntrega(Date fecha){
        this.fecha = fecha;
    }
    
    public Date getFecha(){
        return this.fecha;
    }
}
