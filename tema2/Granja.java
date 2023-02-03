/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Granja {

    /*En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales.
    El número de animales que alimentar (todos de la misma especie) es numAnimales, y sabemos
    que cada animal es una media de kilosPorAnimal.
    Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos
    de alimento suficiente para cada animal. En caso negativo, ha de calcular cuál es la ración
    que corresponde a cada uno de los animales. Nota: evitar que la aplicación haga divisiones por 0.*/
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int comidaDiaria, numAnimales, kilosPorAnimal;

        System.out.println("Introduzca la cantidad de comida diaria: ");
        comidaDiaria = numero.nextInt();

        System.out.println("Introduzca el número de animales que alimentar: ");
        numAnimales = numero.nextInt();

        System.out.println("Introduzca cuántos kilos por animal: ");
        kilosPorAnimal = numero.nextInt();


        if (comidaDiaria > 0 && numAnimales > 0) {
            
            int media = comidaDiaria / numAnimales;

            if (media > comidaDiaria) {
                System.out.println("No hay suficiente cantidad de alimentos.");
            } else {
                System.out.println("La comida correspondiente para cada animal es: " + (comidaDiaria / numAnimales));
            }
        } else {
            System.out.println("No es posible dividir entre 0.");
        }

    }

}
