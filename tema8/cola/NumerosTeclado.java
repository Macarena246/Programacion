/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.cola;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class NumerosTeclado {
    
    public static void main(String[] args) {
        Cola cola = new ColaLista();
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Introduce números enteros para encolar (termina con un número negativo):");
        while (true) {
            num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            cola.encolar(num);
        }

        System.out.println("Desencolando los números de la cola:");
        while (!cola.estaVacia()) {
            System.out.println(cola.desencolar());
        }
    }
}

interface Cola {
    void encolar(int num);
    int desencolar();
    boolean estaVacia();
}

class ColaLista implements Cola {
    Lista lista;

    public ColaLista() {
        lista = new Lista();
    }

    @Override
    public void encolar(int num) {
        lista.insertarFinal(num);
    }

    @Override
    public int desencolar() {
        return lista.eliminar(0);
    }

    @Override
    public boolean estaVacia() {
        return lista.numeroElementos() == 0;
    }
    
}
