/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author Macarena
 */
public class Ej7Buscador {

    /*Escribe la función: int buscar (int t[ ], int clave), que busca de forma
    secuencial en la tabla t el valor clave. En caso de encontrarlo, devuelve en
    qué posición lo encuentra; y en caso contrario, devolverá -1.*/
    
    static int buscar(int t[], int clave) {

        int indiceBusqueda = 0;
        int valor;
        while (indiceBusqueda < t.length && t[indiceBusqueda] != clave) {
            indiceBusqueda++;
        }
        if (indiceBusqueda < t.length) {
            valor = indiceBusqueda;
        } else {
            valor = -1;
        }
        return valor;
    } 
    
    
    public static void main(String[] args) {
        
        int valores [] = {1, 2, 3, 4, 5};
        int buscador = 4;
        int funcion = buscar (valores, buscador);
        System.out.println(funcion);
    }

}
