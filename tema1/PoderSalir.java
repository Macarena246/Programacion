/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class PoderSalir {
    
    /*Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que nos
influyen en esta decisión: si está lloviendo y si hemos terminado nuestras tareas.
Sólo podemos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. Existe
una opción en la que, indistintamente de lo anterior, podremos salir a la calle: el hecho de que
tengamos que ir a la biblioteca (para realizar algún trabajo entregar los libros, etcétera).
Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir
a la biblioteca. El algoritmo debe mostrar mediante un booleano (TRUE o FALSE) si es posible
que se le otorgue el permiso para ir a la calle.*/
    
    public static void main (String [] args){
        Scanner respuesta = new Scanner(System.in);
        System.out.println("¿Llueve?");
        boolean llueve=respuesta.nextBoolean();
        System.out.println("¿Has hecho los deberes?");
         boolean deberes=respuesta.nextBoolean();
          System.out.println("¿Tienes que ir a la biblioteca?");
         boolean biblioteca=respuesta.nextBoolean();
         boolean salir= !llueve&&deberes||biblioteca;
         
        System.out.println("¿Debes salir? " +salir);
    }
}
