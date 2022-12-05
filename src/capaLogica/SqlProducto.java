package capaLogica;

import capaDatos.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SqlProducto {

    PreparedStatement ps = null;
    Conexion conn = null;
    Connection con = null;
    ResultSet rs = null;
    
    public boolean crearProducto(Producto pdc){
        
        conn = new Conexion();
        con = conn.getConexion();
        
        final String SQL = "INSERT INTO producto VALUES(?, ?, ?, ?, ?, ?)";
        
        try {
            ps = con.prepareStatement(SQL);
            ps.setInt(1, pdc.getIdProducto());
            ps.setString(2, pdc.getNombre());
            ps.setInt(3, pdc.getIdCategoria());
            ps.setInt(4, pdc.getPrecioCompra());
            ps.setInt(5, pdc.getStock());
            ps.setString(6, pdc.getFecha());
            
            ps.executeUpdate();

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

    public List<Producto> listarProducto() {
        
        conn = new Conexion();
        con = conn.getConexion();

        List<Producto> listaPdc = new ArrayList();
        
        final String SQL = "SELECT * FROM producto";
    
        try {
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                Producto prd = new Producto();
                prd.setIdProducto(rs.getInt("idproducto"));
                prd.setNombre(rs.getString("nombre"));
                prd.setIdCategoria(Integer.parseInt(rs.getString("cod_categoria")));
                //prd.setIdProveedor(Integer.parseInt(rs.getString("cod_proveedor")));
                prd.setPrecioCompra((rs.getInt("precio_compra")));
                prd.setStock((rs.getInt("stock")));
                prd.setFecha(rs.getString("fecha_ingreso"));
                
                listaPdc.add(prd);
            }
        } catch (SQLException e) {
            System.out.println("Error " + e.toString());
        }
        return listaPdc;
    }
    
    public boolean EliminarProducto(int id){
        
        conn = new Conexion();
        con = conn.getConexion();
        
        final String SQL = "DELETE FROM producto WHERE idproducto=?";
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
    
    public boolean ModificarProducto(Producto pdc){
        
        conn = new Conexion();
        con = conn.getConexion();
        
        final String SQL = "UPDATE producto SET nombre=?, cod_categoria=?, precio_compra=?, stock=?, fecha_ingreso=? WHERE idproducto=?";
        
        try {
            ps = con.prepareStatement(SQL);
            
            ps.setString(1, pdc.getNombre());
            ps.setInt(2, pdc.getIdCategoria());
            ps.setInt(3, pdc.getPrecioCompra());
            ps.setInt(4, pdc.getStock());
            ps.setString(5, pdc.getFecha());
            ps.setInt(6, pdc.getIdProducto());

            ps.execute();

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
    
    public Producto BuscarProd (int id){
        
        conn = new Conexion();
        con = conn.getConexion();
        
        Producto producto = new Producto();
        final String SQL = "SELECT idproducto, nombre, stock FROM producto where idproducto=?";
        
        try {
            ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return producto;
    }
}
