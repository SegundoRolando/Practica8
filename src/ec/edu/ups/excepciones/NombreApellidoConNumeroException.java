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
public class NombreApellidoConNumeroException extends Exception{
    
    public NombreApellidoConNumeroException(){
        
        super("Ha ingresado un carácter no valido en su nombre o apellido");
        
    }
    
}
