package capaDatos;

import capaLogica.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Proveedor {
    
    private int idProveedor;
    private String documen;
    private int idTipoDocumen;
    private String nombre;
    private int idciudad;
    private String direccion;
    private String telefono;
    private String correo;
    private String fecha;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String documen, int idTipoDocumen, String nombre, int idciudad, String direccion, String telefono, String correo, String fecha) {
        this.idProveedor = idProveedor;
        this.documen = documen;
        this.idTipoDocumen = idTipoDocumen;
        this.nombre = nombre;
        this.idciudad = idciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fecha = fecha;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getDocumen() {
        return documen;
    }

    public void setDocumen(String documen) {
        this.documen = documen;
    }

    public int getIdTipoDocumen() {
        return idTipoDocumen;
    }

    public void setIdTipoDocumen(int idTipoDocumen) {
        this.idTipoDocumen = idTipoDocumen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    public Vector<Proveedor> mostrarProveedor(){
        
        PreparedStatement ps;
        ResultSet rs;
   
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        
        Vector<Proveedor> datos = new Vector();
        Proveedor dat;
        
        try {
            
            final String SQL = "SELECT idproveedor, nombre FROM proveedor";
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            
            dat = new Proveedor();
            dat.setIdProveedor(0);
            dat.setNombre("Seleccione un Proveedor");
            datos.add(dat);
            
            while(rs.next()){
                
                dat = new Proveedor();
                dat.setIdProveedor(rs.getInt("idproveedor"));
                dat.setNombre(rs.getString("nombre"));
                datos.add(dat);
            }
            
            rs.close();
        } catch (SQLException e) {
            System.err.println("Error " + e.toString());
        }
        return datos;
    }
        
}
