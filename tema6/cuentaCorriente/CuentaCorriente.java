/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.cuentaCorriente;

/**
 *
 * @author Macarena
 */
public class CuentaCorriente {
    
    /*Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así como el saldo.
    Las típicas operaciones con una cuenta corriente son:
    - Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será O.
    - Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
    - Ingresar dinero: se incrementa el saldo.
    - Mostrar información: muestra la información disponible de la cuenta corriente.*/
    
    /*Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde clases externas y la visibilidad de
      sus atributos para que:
    - Saldo no sea visible para otras clases
    - Nombre sea público para cualquier clase
    - dni solo sea visible por clases vecinas */
    
    /*Get/Set: 
        Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco.
        Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente. Diseñar un
        método que permita recuperar y modificar el nombre del banco (al que pertenecen todas las cuentas corrientes).*/
    
    public String titular;
    String dni;
    private double saldo;
    private static String banco = "Santander"; //private static sigue siendo privado, pero deja de ser un objeto para empezar a ser de toda la clase.
    private Gestor gestor;
    
    
    public CuentaCorriente(String titular, String dni){
        
        this.titular = titular;
        this.dni = dni;
        this.saldo = 0.00;
    }
    
    public CuentaCorriente(String titular, String dni, Gestor gestor){
        
        this.titular = titular;
        this.dni = dni;
        this.saldo = 0.00;
        this.gestor = gestor;
    } 
    
    boolean sacarDinero (double retirada){
        
        boolean resultado = false;
        if (saldo >= retirada){
            saldo -= retirada;
            resultado = true;
        } 
        return resultado;
    }
    
    void ingresarDinero(double dinero){
        saldo += dinero;
    }
    
    String mostrarInfo(){
        
        return "La cuenta pertenece a " + titular + " con DNI " + dni + " y dispone de un saldo de " + saldo + " €.";
        
    }
    
    public static String getBanco (){
        //Si no es static: return this.banco;
        //Si lo es:
        return banco;
    }
    
    public static void setBanco(String nuevoBanco){
        //Si no es static: this.banco = nuevoBanco;
        //Si lo es:
        banco = nuevoBanco;
    }
    
    
}
