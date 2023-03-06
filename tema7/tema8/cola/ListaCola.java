/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.cola;

/**
 *
 * @author Macarena
 */
public class ListaCola implements Cola {
    private Lista lista;

    public ListaCola() {
        lista = new Lista();
    }

    @Override
    public void encolar(Integer numero) {
        lista.insertarFinal(numero);
    }

    @Override
    public Integer desencolar() {
        return lista.eliminar(0);
    }

    @Override
    public Integer primero() {
        return lista.get(0);
    }

    @Override
    public boolean estaVacia() {
        return lista.numeroElementos() == 0;
    }
}

