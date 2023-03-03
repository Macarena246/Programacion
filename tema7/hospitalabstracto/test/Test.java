/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospitalabstracto.test;

import tema7.hospital.trabajador.Area;
import tema7.hospital.trabajador.Trabajador;
import tema7.hospital.trabajador.nomedico.NoMedico;


/**
 *
 * @author Macarena
 */
public class Test {
    
    public static void main(String[] args) {
        
        Trabajador cardiologo1 = new Trabajador("Juan Antonio", 12, 10);
        Trabajador pediatra1 = new Trabajador("Rocío", 23, 20);
        NoMedico enfermero = new NoMedico("Macarena", 25, Area.ENFERMERO);
        
        
    }
    
}
