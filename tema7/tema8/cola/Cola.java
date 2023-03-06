/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.cola;

/**
 *
 * @author Macarena
 */

/*Definir la interfaz Cola para números enteros, e implementarla en la clase Lista.*/

public interface Cola {
    
    void encolar(Integer numero);
    Integer desencolar();
    Integer primero();
    boolean estaVacia();
}
