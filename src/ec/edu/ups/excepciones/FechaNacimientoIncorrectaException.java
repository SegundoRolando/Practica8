/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.excepciones;

/**
 *
 * @author ASUS
 */
public class FechaNacimientoIncorrectaException extends Exception{

    public FechaNacimientoIncorrectaException() {
        super("La fecha de nacimiento no es válida");
    }
    
}
