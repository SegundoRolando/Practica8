package ec.edu.ups.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Karen
 */
public class ControladorDireccione {
    private Connection conexionBD;

    public ControladorDireccione() {
        
    }

    public Connection getConexionBD() {
        return conexionBD;
    }
    
    
    
    public void conectar(){
        String url = "jdbc:postgresql://localhost:5432/MyDataBase";
        String user = "postgres";
        String password = "byron";
        try{
            conexionBD = DriverManager.getConnection(url, user, password);
            if(conexionBD.isValid(5000)){
                System.out.println("Conexion exitosa");
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
    }
    
    public void desconectar(){
        try{
            if(!conexionBD.isClosed()){
            conexionBD.close();
                System.out.println("Conexion Cerrada");
        }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        
    }
}
