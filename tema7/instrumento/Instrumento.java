/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.instrumento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Macarena
 */
public abstract class Instrumento {
    
    /*Crear la clase abstracta Instrumento, que almacena en una tabla las notas musicales de una melodía
    (DO, RE, MI, FA, SOL, LA, SI). El método add() añade nuevas notas musicales. La clase también disspone
    del método abstracto interpretar() que, en cada subclase que herede de Instrumento, mostrará por consola
    las notas musicales según las interprete. Utilizar enumerados para definir las notas musicales.*/
    
    protected List<Nota> notas = new ArrayList<>();
    
    public void add(Nota nota){
        notas.add(nota);
    }
    
    
    public abstract void interpretar();
    
}
