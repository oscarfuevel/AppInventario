package capaDatos;

import capaLogica.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class tipo_documento {
    
    private int idTipoDoc;
    private String nombre;

    public tipo_documento() {
    }

    public tipo_documento(int idTipoDoc, String nombre) {
        this.idTipoDoc = idTipoDoc;
        this.nombre = nombre;
    }

    public int getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(int idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
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

    public Vector<tipo_documento> mostrarTipoDoc(){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
   
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        
        Vector<tipo_documento> datos = new Vector<tipo_documento>();
        tipo_documento dat = null;
        
        try {
            
            final String SQL = "SELECT * FROM tipo_documento";
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            
            dat = new tipo_documento();
            dat.setIdTipoDoc(0);
            dat.setNombre("Seleccione Documento");
            datos.add(dat);
            
            while(rs.next()){
                
                dat = new tipo_documento();
                dat.setIdTipoDoc(rs.getInt("idtipo_documento"));
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
