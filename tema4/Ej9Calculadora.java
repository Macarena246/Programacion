/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Macarena
 */
public class Ej9Calculadora {

    /*Diseñar la función calculadora( ), a la que se le pasan dos números reales (operandos) y
qué operación se desea realizar con ellos. Las operaciones disponibles son: sumar, restar,
multiplicar o dividir. Estas se especifican mediante un número: 1 para la suma, 2 para la
resta, 3 para la multiplicación y 4 para la división. La función devolverá el resultado de la
operación mediante un número real.*/
    
    
    static double calculadora(double num1, double num2, int operando) {

        double operacion = 0;

        switch (operando) {
            case 1:
                double sumar = num1 + num2;
                //System.out.println("La suma de ambos números es: " + sumar);
                operacion = sumar;
                break;
            case 2:
                if (num1 > num2) {
                    double restar = num1 - num2;
                    //System.out.println("La resta de ambos números es: " + restar);
                    operacion = restar;
                }
                if (num1 > num2) {
                    double restar = num1 - num2;
                    //System.out.println("La resta de ambos números es: " + restar);
                    operacion = restar;
                }
                break;
            case 3:
                double multi = num1 * num2;
                //System.out.println("La multiplicación de ambos números es: " + multi);
                operacion = multi;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No es divisible.");
                    break;
                } else {
                    double division = num1 / num2;
                    //System.out.println("La división de ambos números es: " + division);
                    operacion = division;
                }
                break;
            default:
                break;
        }
        return operacion;
    }

    public static void main(String[] args) {

        double a, b;
        int operando;
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese dos números e indique la operación que quiere realizar: ");
        a = numero.nextDouble();
        b = numero.nextDouble();
        operando = numero.nextInt();

        System.out.println("El resultado es: " + calculadora(a, b, operando));
    }

}
