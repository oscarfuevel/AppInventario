package capaDatos;

import capaLogica.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Ciudad {
    private int idCiudad;
    private String nombre;

    public Ciudad() {
    }

    public Ciudad(int idCiudad, String Nombre) {
        this.idCiudad = idCiudad;
        this.nombre = Nombre;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    public Vector<Ciudad> mostrarCiudad(){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
   
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        
        Vector<Ciudad> datos = new Vector<Ciudad>();
        Ciudad dat = null;
        
        try {
            
            final String SQL = "SELECT * FROM Ciudad";
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            
            dat = new Ciudad();
            dat.setIdCiudad(0);
            dat.setNombre("Seleccione Ciudad");
            datos.add(dat);
            
            while(rs.next()){
                
                dat = new Ciudad();
                dat.setIdCiudad(rs.getInt("idciudad"));
                dat.setNombre(rs.getString("nombre"));
                datos.add(dat);
            }
            
            rs.close();
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
        return datos;
    }
}
