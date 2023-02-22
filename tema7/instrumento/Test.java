/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.instrumento;

/**
 *
 * @author Macarena
 */
public class Test {
    
    public static void main(String[] args) {
        Instrumento piano = new Piano();
        piano.add(Nota.DO);
        piano.add(Nota.SOL);
        piano.add(Nota.LA);
        piano.add(Nota.MI);
        piano.interpretar();
    }
    
}
