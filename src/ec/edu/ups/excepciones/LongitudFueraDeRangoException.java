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
public class LongitudFueraDeRangoException extends Exception {

    public LongitudFueraDeRangoException() {
        super("La longitud de nombre debe ser entre 10 y 20 caracteres");
    }
    
}
