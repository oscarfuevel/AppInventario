package capaLogica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private final String USER = "root";
    private final String PASSWORD = "1234";
    private final String URL = "jdbc:mysql://localhost:3306/appinventario";
    private Connection conexion = null;

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión OK");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            System.out.println("Error en la conexion");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        return conexion;
    }
    
}
