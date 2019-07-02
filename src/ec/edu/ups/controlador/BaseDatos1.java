package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Direcciones;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class BaseDatos1 {
   
    ControladorDireccione miBaseDatos;

    public BaseDatos1() {
    
        miBaseDatos=new ControladorDireccione();
    }
    
    
     public void llenarCedulas(JComboBox cedulas){
       
        try {
            String sql="SELECT * FROM \"PERSONAS\";";
            
            miBaseDatos.conectar();
            Statement sta=miBaseDatos.getConexionBD().createStatement();
            ResultSet respuesta =sta.executeQuery(sql);
            
            cedulas.addItem("Elija una opcion");
            
            while(respuesta.next()){
                cedulas.addItem(respuesta.getString("PER_CEDULA"));
            }
            miBaseDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
    }
    
    
     public void crearDireccion(Direcciones direcciones,String cedula){
        
        try {
            String sql="INSERT INTO \"DIRECCIONES\" VALUES ("+direcciones.getCodigo()+","
                    + "'"+direcciones.getCallePrincipal()+"',"
                    + "'"+direcciones.getCalleSecundaria()+"',"
                    +direcciones.getNumeroDireccion()+","
                    + "'"+cedula+"');";
            miBaseDatos.conectar();
            Statement sta=miBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDatos.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
     public Direcciones buscarDireccion(String cedula){
        Direcciones direccion=new Direcciones();
        try {
            String sql="SELECT * FROM \"DIRECCIONES\" WHERE \"PER_CEDULA\"='"+cedula+"';";
            miBaseDatos.conectar();
            System.out.println(sql);
            Statement sta=miBaseDatos.getConexionBD().createStatement();
            ResultSet resultado=sta.executeQuery(sql);
            while(resultado.next()){
            direccion.setCodigo(resultado.getInt("DIR_CODIGO"));
            direccion.setCallePrincipal(resultado.getString("DIR_CALLE_PRINCIPAL"));
            direccion.setCalleSecundaria(resultado.getString("DIR_CALLE_SECUNDARIA"));
            direccion.setNumeroDireccion(resultado.getInt("DIR_NUMERO"));
            }
            miBaseDatos.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return direccion;
    }
    
    public List<Direcciones> listaDireccion(){
        List<Direcciones> listallenado=new ArrayList<>();
        try {
            String sql="SELECT * FROM \"DIRECCIONES\";";
            System.out.println(sql);
            miBaseDatos.conectar();
            System.out.println(sql);
            Statement sta=miBaseDatos.getConexionBD().createStatement();
            ResultSet resultado=sta.executeQuery(sql);
            while(resultado.next()){
            Direcciones direccion=new Direcciones();
            direccion.setCodigo(resultado.getInt("DIR_CODIGO"));
            direccion.setCallePrincipal(resultado.getString("DIR_CALLE_PRINCIPAL"));
            direccion.setCalleSecundaria(resultado.getString("DIR_CALLE_SECUNDARIA"));
            direccion.setNumeroDireccion(resultado.getInt("DIR_NUMERO"));
            direccion.setCedula(resultado.getString("PER_CEDULA"));
            listallenado.add(direccion);
            }
            miBaseDatos.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listallenado;
    }
    
    public void deleteDireccion(String cedula){
        try {
            String sql= "DELETE FROM \"DIRECCIONES\" WHERE \"PER_CEDULA\"='"+cedula+"';";
            
            miBaseDatos.conectar();
            
            Statement sta= miBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void actualizarDireccion(Direcciones d,String cedula){
        String sql="UPDATE \"DIRECCIONES\" SET \"DIR_CODIGO\" = " + d.getCodigo() + ","
                 + "\"DIR_CALLE_PRINCIPAL\" = '" + d.getCallePrincipal()+ "',"
                + "\"DIR_CALLE_SECUNDARIA\" = '" +d.getCalleSecundaria() + "',"
                + "\"DIR_NUMERO\" = '" + d.getNumeroDireccion()+ ","
                + "\"PER_CEDULA\" = '" + cedula + "':"
                + "WHERE \"PER_CEDULA\" = '" + cedula + "';";
        miBaseDatos.conectar();
        System.out.println(sql);
        try{
        Statement sta=miBaseDatos.getConexionBD().createStatement();
        sta.execute(sql);
        miBaseDatos.desconectar();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
   
}
