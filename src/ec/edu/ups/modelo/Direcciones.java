/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author ASUS
 */
public class Direcciones {
    
    private int  codigo;
    private String callePrincipal;
    private String calleSecundaria;
    private int numeroDireccion;
    private String cedula;

    public Direcciones() {
    }

    public Direcciones(int codigo, String callePrincipal, String calleSecundaria, int numeroDireccion, String cedula) {
        this.codigo = codigo;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.numeroDireccion = numeroDireccion;
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public int getNumeroDireccion() {
        return numeroDireccion;
    }

    public void setNumeroDireccion(int numeroDireccion) {
        this.numeroDireccion = numeroDireccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Direcciones{" + "codigo=" + codigo + ", callePrincipal=" + callePrincipal + ", calleSecundaria=" + calleSecundaria + ", numeroDireccion=" + numeroDireccion + ", cedula=" + cedula + '}';
    }
    
    
    
}
