/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.cuentaCorriente;

/**
 *
 * @author Macarena
 */
public class Gestor {

    /*Existen gestores que administran las cuentas bancarias y atienden a sus propietarios.
    Cada cuenta, en caso de tenerlo, cuenta con un único gestor. Diseñar la clase Gestor de la que interesa guardar su
    nombre, teléfono y el importe máximo autorizado con el que pueden operar. Con respecto a los gestores, existen las
    siguientes restricciones:
    - Un gestor tendrá siempre un nombre y un teléfono.
    - Si no se asigna, el importe máximo autorizado por operación será de 10000 euros.
    - Un gestor, una vez asignado, no podrá cambiar su número de teléfono (quiere decir que no va a tener un set).
      Y todo el mundo podrá consultarlo (va a ser public y tendrá un get).
    El nombre será público y el importe máximo sólo será visible por clases vecinas.
    Modificar la clase CuentaCorriente para que pueda disponer de un objeto Gestor. Escribir los métodos necesarios.*/
    
    
    public String nombre = null; //Atributos
    private String telefono = null;
    double importeMax = 10000;

    public Gestor(String nombre, String telefono) { //Constructor

        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setImporteMax(double importe) {

        this.importeMax = importe;
    }
}
