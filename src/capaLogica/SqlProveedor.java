package capaLogica;

import capaDatos.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SqlProveedor {
 
    PreparedStatement ps = null;
    Conexion conn = null;
    Connection con = null;
    ResultSet rs = null;

    public boolean crearProveedor(Proveedor prove) {
        conn = new Conexion();
        con = conn.getConexion();

        final String SQL = "INSERT INTO proveedor(documento, cod_tipodocumento, nombre, cod_ciudad, direccion, telefono, correo, fecha) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, prove.getDocumen());
            ps.setInt(2, prove.getIdTipoDocumen());
            ps.setString(3, prove.getNombre());
            ps.setInt(4, prove.getIdciudad());
            ps.setString(5, prove.getDireccion());
            ps.setString(6, prove.getTelefono());
            ps.setString(7, prove.getCorreo());
            ps.setString(8, prove.getFecha());

            ps.executeUpdate();

            con.close();

            return true;

        } catch (SQLException e) {
            System.err.println(e.toString());
            

            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }

            return false;
        }
    }

    public List listarProveedor() {

        conn = new Conexion();
        con = conn.getConexion();

        List<Proveedor> ListaProv = new ArrayList();
        final String SQL = "SELECT * FROM proveedor";

        try {
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                Proveedor prv = new Proveedor();
                prv.setIdProveedor(rs.getInt("idproveedor"));
                prv.setDocumen(rs.getString("documento"));
                prv.setIdTipoDocumen(Integer.parseInt(rs.getString("cod_tipodocumento")));
                prv.setNombre(rs.getString("nombre"));
                prv.setIdciudad(Integer.parseInt(rs.getString("cod_ciudad")));
                prv.setDireccion(rs.getString("direccion"));
                prv.setTelefono(rs.getString("telefono"));
                prv.setCorreo(rs.getString("correo"));
                prv.setFecha(rs.getString("fecha"));
                
                ListaProv.add(prv);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaProv;
    }
    
    public boolean EliminarProveedor(int id){
        
        conn = new Conexion();
        con = conn.getConexion();
        
        final String SQL = "DELETE FROM proveedor WHERE idproveedor=?";
        try {
            ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ps.execute();
            
            return true;
            
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    } 
    
    public boolean ModificarProveedor(Proveedor prove){
        
        conn = new Conexion();
        con = conn.getConexion();
        
        final String SQL = "UPDATE proveedor SET documento=?, cod_tipodocumento=?, nombre=?, cod_ciudad=?, direccion=?, telefono=?, correo=?, fecha=? WHERE idproveedor=?";
        
        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, prove.getDocumen());
            ps.setInt(2, prove.getIdTipoDocumen());
            ps.setString(3, prove.getNombre());
            ps.setInt(4, prove.getIdciudad());
            ps.setString(5, prove.getDireccion());
            ps.setString(6, prove.getTelefono());
            ps.setString(7, prove.getCorreo());
            ps.setString(8, prove.getFecha());
            ps.setInt(9, prove.getIdProveedor());

            ps.executeUpdate();

            return true;

        } catch (SQLException e) {
            System.err.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e.toString());
            }
        }
    }

}
