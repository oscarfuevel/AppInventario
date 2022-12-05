package capaLogica;

import capaDatos.DetalleSalida;
import capaDatos.Salida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SqlSalida {
    
    PreparedStatement ps = null;
    Conexion conn = null;
    Connection con = null;
    ResultSet rs = null;
    
    int result;
    
    public int IdSalida(){
        int id = 0;
        final String SQL = "SELECT MAX(idsalida) FROM salida";
        try {
            conn = new Conexion();
            con = conn.getConexion();
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            if(rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return id;
    }
    
    public int registrarSalida(Salida salida){
        
        final String SQL = "INSERT INTO salida (nomCliente, telefono, correo, num_factura, fecha) VALUES (?, ?, ?, ?, ?)";
        try {
            conn = new Conexion();
            con = conn.getConexion();
            ps = con.prepareStatement(SQL);
            ps.setString(1, salida.getNombre());
            ps.setString(2, salida.getTelefono());
            ps.setString(3, salida.getCorreo());
            ps.setString(4, salida.getFactura());
            ps.setString(5, salida.getFecha());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return result;
    }
    
    public int RegistrarDetalle(DetalleSalida deta){
        
        final String SQL = "INSERT INTO detalle_salida (cod_producto, nombre, cantidad, idSalida) VALUES(?, ?, ?, ?)";
        try {
            conn = new Conexion();
            con = conn.getConexion();
            ps = con.prepareStatement(SQL);
            ps.setString(1, deta.getCodiPro());
            ps.setString(2, deta.getNombre());
            ps.setString(3, deta.getCantidad());
            ps.setInt(4, deta.getId());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return result;
    }
    
    public boolean ActualizarStock(int cant, String cod){
        final String SQL = "UPDATE producto SET stock = ? WHERE idproducto = ?";
        try {
            conn = new Conexion();
            con = conn.getConexion();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, cant);
            ps.setString(2, cod);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public List<Salida> listarSalidas() {
        
        conn = new Conexion();
        con = conn.getConexion();

        List<Salida> listaSalidas = new ArrayList();
        
        final String SQL = "SELECT idsalida, nomcliente, num_factura, fecha FROM salida";
    
        try {
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                Salida sal = new Salida();
                sal.setIdSalida(rs.getInt("idsalida"));
                sal.setNombre(rs.getString("nomcliente"));
                sal.setFactura(rs.getString("num_factura"));
                sal.setFecha(rs.getString("fecha"));
                
                listaSalidas.add(sal);
            }
        } catch (SQLException e) {
            System.out.println("Error " + e.toString());
        }
        return listaSalidas;
    }
}
