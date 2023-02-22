/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.hospital.test;

import tema7.hospital.trabajador.Area;
import tema7.hospital.trabajador.Especialidad;
import tema7.hospital.trabajador.Medico;
import tema7.hospital.trabajador.NoMedico;

/**
 *
 * @author Macarena
 */
public class Test {
    
    public static void main(String[] args) {
        
        Medico medico1 = new Medico("Juan Antonio", 1234, 2300.50, Especialidad.PEDIATRA, 69, 120);
        NoMedico medico2 = new NoMedico("Macarena", 321, 1500, Area.ENFERMERO);
        medico1.getEspecialidad();
        System.out.println("La especialidad del médico es " + medico1.getEspecialidad());
        medico2.getArea();
        System.out.println("El área de trabajo es " + medico2.getArea());
        System.out.println("El nombre del médico es " + medico1.getNombre());
        medico1.setNombre("Álvaro");
        medico1.getNombre();
        System.out.println("El nombre del nuevo médico es " + medico1.getNombre());
        
    }
}
