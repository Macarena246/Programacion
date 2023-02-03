/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.cuentaCorriente;

/**
 *
 * @author Macarena
 */
public class TestCuentaCorriente {
    
    public static void main(String[] args) {
        
        Gestor gestor = new Gestor ("Rocío", "954401365");
        CuentaCorriente c = new CuentaCorriente("Macarena Jurado", "1234");
        System.out.println(c.mostrarInfo());
        System.out.println(c.sacarDinero(100));
        System.out.println(c.mostrarInfo());
        c.ingresarDinero(500);
        System.out.println(c.sacarDinero(100));
        System.out.println(c.mostrarInfo());
        
        CuentaCorriente c2 = new CuentaCorriente ("Macarena", "09235802");
        System.out.println(CuentaCorriente.getBanco()); //Si no fuera static, pondríamos dentro (c2.getBanco())
        c2.setBanco("Openbank");
        System.out.println(CuentaCorriente.getBanco());
    }
    
}
