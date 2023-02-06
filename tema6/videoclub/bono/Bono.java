/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.videoclub.bono;

/**
 *
 * @author Macarena
 */
public class Bono {
    
    double credito;
    int periodo;
    double costo;
    
    public Bono(double credito, int periodo, double costo){
        this.credito = credito;
        this.periodo = periodo;
        this.costo = costo;
    }
    
    public int getPeriodo(){
        return this.periodo;
    }
    
    public void setPeriodo(int periodo){
        this.periodo = periodo;
    }
    
    public double getCosto(){
        return this.costo;
    }
    
    public void setCosto(double costo){
        this.costo = costo;
    }
    
}
