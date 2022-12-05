package capaLogica;

import capaDatos.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SqlCliente {

    PreparedStatement ps = null;
    Conexion conn = null;
    Connection con = null;
    ResultSet rs = null;

    public boolean crearCliente(Cliente cliente) {
        conn = new Conexion();
        con = conn.getConexion();

        final String SQL = "INSERT INTO cliente(documento, tipodocumento, nombre, ciudad, direccion, telefono, correo, fecha) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, cliente.getDocumen());
            ps.setInt(2, cliente.getIdTipoDocumen());
            ps.setString(3, cliente.getNombre());
            ps.setInt(4, cliente.getIdciudad());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getTelefono());
            ps.setString(7, cliente.getCorreo());
            ps.setString(8, cliente.getFecha());

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

    public List listarCliente() {

        conn = new Conexion();
        con = conn.getConexion();

        List<Cliente> ListaCli = new ArrayList();
        final String SQL = "SELECT * FROM cliente";

        try {
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cl = new Cliente();
                cl.setIdCliente(rs.getInt("idcliente"));
                cl.setDocumen(rs.getString("documento"));
                cl.setIdTipoDocumen(Integer.parseInt(rs.getString("tipodocumento")));
                cl.setNombre(rs.getString("nombre"));
                cl.setIdciudad(Integer.parseInt(rs.getString("ciudad")));
                cl.setDireccion(rs.getString("direccion"));
                cl.setTelefono(rs.getString("telefono"));
                cl.setCorreo(rs.getString("correo"));
                cl.setFecha(rs.getString("fecha"));
                
                ListaCli.add(cl);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaCli;
    }
    
    public boolean EliminarCliente(int id){
        
        conn = new Conexion();
        con = conn.getConexion();
        
        final String SQL = "DELETE FROM cliente WHERE idcliente=?";
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
    
    public boolean ModificarCliente(Cliente cliente){
        
        conn = new Conexion();
        con = conn.getConexion();
        
        final String SQL = "UPDATE cliente SET documento=?, tipodocumento=?, nombre=?, ciudad=?, direccion=?, telefono=?, correo=?, fecha=? WHERE idcliente=?";
        
        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, cliente.getDocumen());
            ps.setInt(2, cliente.getIdTipoDocumen());
            ps.setString(3, cliente.getNombre());
            ps.setInt(4, cliente.getIdciudad());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getTelefono());
            ps.setString(7, cliente.getCorreo());
            ps.setString(8, cliente.getFecha());
            ps.setInt(9, cliente.getIdCliente());

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
    
    public Cliente BuscarCliente(String cedNit){
        
        Cliente cliente = new Cliente();
        final String SQL = "SELECT nombre, telefono, correo FROM cliente WHERE documento = ?";
        conn = new Conexion();
        con = conn.getConexion();
        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, cedNit);
            rs = ps.executeQuery();
            if(rs.next()){
                cliente.setNombre(rs.getString("nombre"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setCorreo(rs.getString("correo"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return cliente;
    }
    
}
