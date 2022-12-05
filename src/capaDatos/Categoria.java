package capaDatos;

import capaLogica.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Categoria {
    
    private int idCategoria;
    private String nombre;

    public Categoria() {
    }

    public Categoria(int idCategoria, String nombre) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
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
    
    public Vector<Categoria> mostrarCategoria(){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
   
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        
        Vector<Categoria> datos = new Vector<Categoria>();
        Categoria dat = null;
        
        try {
            
            final String SQL = "SELECT * FROM categoria";
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            
            dat = new Categoria();
            dat.setIdCategoria(0);
            dat.setNombre("Seleccione una categoria");
            datos.add(dat);
            
            while(rs.next()){
                
                dat = new Categoria();
                dat.setIdCategoria(rs.getInt("idcategoria"));
                dat.setNombre(rs.getString("nom_categoria"));
                datos.add(dat);
            }
            
            rs.close();
        } catch (SQLException e) {
            System.err.println("Error " + e.toString());
        }
        return datos;
    }
}
