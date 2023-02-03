/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.hora;

/**
 *
 * @author Macarena
 */
public class Hora {
    
    /*Escribir un programa que lea por teclado una hora cualquiera y un número n que representa una cantidad en
    segundos. El programa mostrará la hora introducida y las n siguientes, que se diferencian en un segundo. Para
    ello hemos de diseñar previamente la clase Hora que dispone de los atributos hora, minuto y segundo. Los
    valores de los atributos se controlarán mediante métodos set/get.*/
    
    int hora;
    int minutos;
    int segundos;
    
    public Hora (int hora, int minutos, int segundos){
        
        this.hora = hora + 1;
        
    }
    
}
